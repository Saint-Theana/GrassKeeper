package com.ulcade.client;
import com.ulcade.packet.PacketPingReq;
import io.netty.buffer.ByteBuf;
import com.ulcade.util.Util;

public class HeartbeatThread implements Runnable
{
	private GameClient client;

	private User user;

	private ClientConfig clientConfig;

	public HeartbeatThread(GameClient client,User user,ClientConfig clientConfig)
	{
		this.client = client;
		this.user=user;
		this.clientConfig=clientConfig;
	}

	public void run()
	{
		PacketPingReq req =new PacketPingReq(client);
		client.send(req);
	}
}

