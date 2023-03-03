package com.ulcade;

public class CommandLogout extends BaseCommand
{
	public CommandLogout(TerminalApp app){
		super(app);
	}


	public void exec(String[] args)
	{
		app.logout();
	}
}
