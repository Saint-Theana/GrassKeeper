package com.ulcade;

import com.ulcade.sdk.Plugin;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import com.ulcade.sdk.FriendInfo;

public class CommandFriend extends BaseCommand
{
	public CommandFriend(TerminalApp app)
	{
		super(app);
	}


	public void exec(String[] args)
	{
		if(app.getClient()==null){
			System.out.println("not logined yet.");
			return;
		}
		Option op =new Option("l", "list", false, "friend list");
		Option op1 =new Option("a", "add", true, "add friend");
		Option op3 =new Option("d", "delete", true, "delete friend");
		Option op4 =new Option("r", "refresh", false, "refresh friend list");
		Options ops=new Options();
		ops.addOption(op).addOption(op1).addOption(op3).addOption(op4);
		try
		{
			CommandLine a=new PosixParser().parse(ops, args);
            if (a.hasOption("l"))
            {
				for (FriendInfo info:app.getClient().getFriendList())
				{
					System.out.println(info.uid + ": " + info.nickname);
				}
			}
			else if (a.hasOption("r"))
			{
				app.getClient().updatePlayerFriendList();
			}
			else if (a.hasOption("a"))
			{
				String name=a.getOptionValue("add");
				app.getClient().requestAddFriend(Integer.parseInt(name));

			}
			else if (a.hasOption("d"))
			{
				String name=a.getOptionValue("delete");
				app.getClient().requestDeleteFriend(Integer.parseInt(name));
			}
			else
			{
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
