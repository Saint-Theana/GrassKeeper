package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.PlayerLoginRsp;

public class PlayerLoginRspHandler extends BaseHandler
{

	public PlayerLoginRspHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		PlayerLoginRsp playerLoginReq=ProtobufDecoder.decodeFrom(new PlayerLoginRsp(),payload);
		//playerLoginReq.
		gameClient.setTotalTickTime(playerLoginReq.totalTickTime);
		gameClient.startHeartBeat();
		gameClient.updatePlayerFriendList();
		System.out.println("account logined.");
		//System.err.println(PublicConstant.gson.toJson(playerLoginReq));
	}
}
