package com.ulcade;

public class CommandHelp extends BaseCommand
{
	public CommandHelp(TerminalApp app){
		super(app);
	}

	public void exec(String[] args)
	{
		System.out.println("help: print this message.");
		System.out.println("login: login the account.");
		System.out.println("logout: logout the account.");
		System.out.println("plugin: ");
		System.out.println("    -l|--list: show all loaded plugin");
		System.out.println("    -e|--enable: enable a plugin");
		System.out.println("    -d|--disable: disable a plugin");
		System.out.println("    -n|--name: specify a plugin name");
		System.out.println("    -r|--refresh: reload all plugin");
		System.out.println("friend: ");
		System.out.println("    -l|--list: show all friends");
		System.out.println("    -d|--delete: delete a friend");
		System.out.println("    -a|--add: add a friend");
		System.out.println("    -r|--refresh: refresh all friend");
	}
}
