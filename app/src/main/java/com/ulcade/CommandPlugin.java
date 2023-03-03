package com.ulcade;

import com.ulcade.sdk.Plugin;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;

public class CommandPlugin extends BaseCommand
{
	public CommandPlugin(TerminalApp app)
	{
		super(app);
	}


	public void exec(String[] args)
	{
		Option op =new Option("l", "list", false, "插件列表");
		Option op1 =new Option("e", "enable", false, "开启插件");
		Option op3 =new Option("n", "name", true, "插件名称");
		Option op4 =new Option("d", "disable", false, "关闭插件");
		Option op5 =new Option("r", "refresh", false, "重新加载插件");
		Options ops=new Options();
		ops.addOption(op).addOption(op1).addOption(op3).addOption(op4).addOption(op5);
		try
		{
			CommandLine a=new PosixParser().parse(ops, args);
            if (a.hasOption("l"))
            {
				for (Plugin plugin:app.getPlugins())
				{
					System.out.println(plugin.toString());
				}
			}else if (a.hasOption("r"))
			{
				app.reloadPlugin();
				exec(new String[]{"-l"});
			}
			else if (a.hasOption("e"))
			{
				if (a.hasOption("n"))
				{
					String name=a.getOptionValue("name");
					Plugin plugin=app.getPluginByName(name);
					if(plugin==null){
						System.out.println("plugin named "+name+" was not found.");
					}else{
						plugin.setEnabled(true);
						exec(new String[]{"-l"});
					}
				}
				else
				{
					System.out.println("needs to specify a name of plugin to enable.");
				}
			}
			else if (a.hasOption("d"))
			{
				if (a.hasOption("n"))
				{
					String name=a.getOptionValue("name");
					Plugin plugin=app.getPluginByName(name);
					if(plugin==null){
						System.out.println("plugin named "+name+" was not found.");
					}else{
						plugin.setEnabled(false);
						exec(new String[]{"-l"});
					}
				}
				else
				{
					System.out.println("needs to specify a name of plugin to disable.");
				}
			}else{
				System.out.println("needs to specify a param.");
			}
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
