package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.ChatInfo;
import org.sorapointa.proto.PrivateChatNotify;

public class PrivateChatNotifyHandler extends BaseHandler
{

	public PrivateChatNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		PrivateChatNotify notify = ProtobufDecoder.decodeFrom(new PrivateChatNotify(), payload);
		ChatInfo info= notify.chatInfo;
		String message=null;
		if (info.systemHint != null)
		{
			switch (info.systemHint.type)
			{
					//not magic number
					/*
					enum SystemHintType {
						CHAT_NONE= 0;
						CHAT_ENTER_WORLD = 1;
						CHAT_LEAVE_WORLD = 2;
					}*/
				case 0:
					message="hint:[CHAT_NONE]";
					break;
				case 1:
					message="hint:[CHAT_ENTER_WORLD]";
					break;
				case 2:
					message="hint:[CHAT_LEAVE_WORLD]";
					break;
			}
		}
		else if (info.text != null)
		{
			message=info.text;
			gameClient.getRobot().onPrivateMessage(info.uid,info.text);
		}
		else if (info.icon != null)
		{
			message="icon:["+info.icon+"]";
			gameClient.getRobot().onPrivateMessage(info.uid,info.icon);
		}
		System.out.println("recieve message from "+info.uid+ " message: "+message);
		

	}
}
