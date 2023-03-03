package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;

public abstract class BaseHandler
{
	protected GameClient gameClient;

	protected User user;

	protected ClientConfig clientConfig;

	public BaseHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		this.gameClient = gameClient;
		this.user = user;
		this.clientConfig = clientConfig;
	}
	
	public abstract void process(byte[] header,byte[] payload);
}
