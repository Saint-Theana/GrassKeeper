package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.DealAddFriendRsp;

public class DealAddFriendRspHandler extends BaseHandler
{
	public DealAddFriendRspHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}

	@Override
	public void process(byte[] header, byte[] payload)
	{
		DealAddFriendRsp notify= ProtobufDecoder.decodeFrom(new DealAddFriendRsp(),payload);
		if(notify.dealAddFriendResult==1){//accepted
			gameClient.updatePlayerFriendList();
		}
	}
}
