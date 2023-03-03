package com.ulcade;

import com.ulcade.client.User;
import io.github.sainttheana.BasicTerminal;
import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;
public class CommandLogin extends BaseCommand
{
	public CommandLogin(TerminalApp app)
	{
		super(app);
	}


	public void exec(String[] args)
	{
		try
		{
			if (app.getClient() != null)
			{
				System.err.println("already logined.");
				return;
			}
			String data=new String(Files.readAllBytes(new File("conf/user.json").toPath()));
			//System.err.println(data);
			final User user=PublicConstant.gson.fromJson(data, User.class);
			if (user.uid == 0)
			{
				//Scanner sc = new Scanner(System.in);
				System.out.println("input your account.");
				InputDistributor.registerHighPriority(new InputDistributor.InputReader(){
						@Override
						public void read(final String account)
						{
							app.getTerminal().disableInputVisibility();
							System.out.println("input your password.");
							InputDistributor.registerHighPriority(new InputDistributor.InputReader(){
									@Override
									public void read(String password)
									{
										user.account = account;
										user.password = password;
										app.getTerminal().enableInputVisibility();
										InputDistributor.unRegister(this);
										app.createAndStartNewClient(user);
									}
								});
							
							InputDistributor.unRegister(this);
						}
					});


//				

//				app.getTerminal().interceptReader(new BasicTerminal.InputReader(){
//						@Override
//						public void read(String input)
//						{
//							user.account = input;
//							app.getTerminal().releaseReader();
//							app.getTerminal().disableInputVisibility();
//							System.out.println("输入密码");
//							app.getTerminal().interceptReader(new BasicTerminal.InputReader(){
//									@Override
//									public void read(String input)
//									{
//										user.password = input;
//										app.getTerminal().releaseReader();
//										app.getTerminal().enableInputVisibility();
//										app.createAndStartNewClient(user);
//									}
//								});
//						}
//					});


			}
			else
			{
				app.createAndStartNewClient(user);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}



	}





}
