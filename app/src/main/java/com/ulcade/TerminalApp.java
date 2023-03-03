package com.ulcade;

import com.ulcade.PublicConstant;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.sdk.Plugin;
import io.github.sainttheana.BasicTerminal;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class TerminalApp implements InputDistributor.InputReader
{
	private BasicTerminal terminal;

	private GameClient client;

	private List<Plugin> plugins;

	public TerminalApp()
	{
		plugins = new ArrayList<>();

		try
		{
			//EventBus.getDefault().register(this);
            terminal = new BasicTerminal();
			terminal.setOverrideStandardErr(true);
			terminal.setOverrideStandardOut(true);
			terminal.setOverrideStandardIn(true);
            //terminal.initHistory(new File(".history"));
        }
		catch (Exception e)
		{
            e.printStackTrace();
        }
	}

	public GameClient getClient()
	{
		return client;
	}

	public void logout()
	{
		if(client==null){
			System.out.println("not logined yet.");
			return;
		}
		client.stop();
		client=null;
	}

	public void reloadPlugin()
	{
		if (client != null)
		{
			for (Plugin plugin:plugins)
			{
				client.getRobot().unRegisterPlugin(plugin);
			}
		}
		plugins.clear();
		loadPlugins();
		if (client != null)
		{
			plugAllPlugin();
		}
	}

	public Plugin getPluginByName(String name)
	{
	    for (Plugin pligin:plugins)
		{
			if (pligin.name().equals(name))
			{
				return pligin;
			}
		}
		return null;
	}

	private void plugAllPlugin()
	{
		for (Plugin plugin:plugins)
		{
		    client.getRobot().registerPlugin(plugin);
		}
	}

	private void loadPlugins()
	{
		File pluginPath = new File("plugin");
		if(!pluginPath.exists()){
			return;
		}
		for (File pluginFile:pluginPath.listFiles(new FilenameFilter(){

				@Override
				public boolean accept(File p1, String p2)
				{
					return p2.endsWith(".jar");
				}
			}))
		{
			//System.err.println(pluginFile);
			try
			{

				ClassLoader loader = new URLClassLoader(new URL[]{new URL("file://" + pluginFile.getAbsolutePath())});
				Class<?> pluginCls = loader.loadClass("com.robot.Main");
				final Plugin pluginInstence= (Plugin) pluginCls.getConstructor().newInstance();
				plugins.add(pluginInstence);
			}
			catch (Exception e)
			{
				StringWriter sw = new StringWriter();
				PrintWriter pw=new PrintWriter(sw);
				e.printStackTrace(pw);
				System.out.println(sw.toString());
			}
		}
	}

	public void setPlugins(List<Plugin> plugins)
	{
		this.plugins = plugins;
	}

	public List<Plugin> getPlugins()
	{
		return plugins;
	}

	public void createAndStartNewClient(User user)
	{
		if (!new File("conf/client.json").exists())
		{
		    System.out.println("conf/client.json not found.");
		}
		try
		{
			String data=new String(Files.readAllBytes(PublicConstant.clientConfigFile.toPath()));
			ClientConfig clientInfo =PublicConstant.gson.fromJson(data, ClientConfig.class);
			GameClient gameclient=new GameClient(user, clientInfo, terminal);
			gameclient.setRegionSelector(new GameClient.RegionSelector(){

					int numberSelected=0;

					@Override
					public int select(final String[] regions)
					{
						for (int i=0;i < regions.length;i += 1)
						{
							System.out.println((i + 1) + " " + regions[i]);
						}
						System.out.println("please select one by enter 1 - " + regions.length);
						InputDistributor.registerHighPriority(new InputDistributor.InputReader(){
								@Override
								public void read(String input)
								{
									try
									{
										int index=Integer.parseInt(input);
										if (index <= 0 || index > regions.length)
										{
											System.out.println("wrong number please retry");
										}
										else
										{
											numberSelected = index;
											InputDistributor.unRegister(this);
										}
									}
									catch (NumberFormatException e)
									{
										e.printStackTrace();
									}
								}
							});
						
						while(numberSelected==0){
							
							try
							{
								Thread.currentThread().sleep(500);
							}
							catch (InterruptedException e)
							{
								e.printStackTrace();
							}
						}
						
						//block until region was selected
						return numberSelected-1;

					}
				});
			this.client = gameclient;
			new Thread(gameclient).start();
			plugAllPlugin();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}

	}

	public BasicTerminal getTerminal()
	{
		return terminal;
	}

	public void start()
	{
		loadPlugins();
		try
		{
			//Thread.currentThread().sleep(500);
			terminal.process();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		new InputDistributor().start();
		InputDistributor.registerLowPriority(this);
	}

	
	@Override public void read(String input)
	{
		List<String> arg=new ArrayList<String>(Arrays.asList(input.split("\\s+")));
		String cmd=arg.remove(0);
		String[] args=arg.toArray(new String[]{});
		switch (cmd)
		{
			case "login":{
					new CommandLogin(this).exec(args);
				}break;
			case "plugin":{
					new CommandPlugin(this).exec(args);
				}break; 
			case "logout":{
					new CommandLogout(this).exec(args);
				}break; 
			case "friend":{
					new CommandFriend(this).exec(args);
				}break; 
			case "help":{
					new CommandHelp(this).exec(args);
				}break; 

		}
	}
}
