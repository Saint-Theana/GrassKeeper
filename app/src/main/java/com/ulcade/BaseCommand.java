package com.ulcade;
public abstract class BaseCommand
{
	protected TerminalApp app;
	
	public BaseCommand(TerminalApp app){
		this.app=app;
	}
	
	public abstract void exec(String[] args);
	
	
}
