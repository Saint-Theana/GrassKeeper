package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.DeleteFriendRsp;

public class DeleteFriendRspHandler extends BaseHandler
{

	public DeleteFriendRspHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		DeleteFriendRsp notify=ProtobufDecoder.decodeFrom(new DeleteFriendRsp(),payload);
		gameClient.deleteFriendByUid(notify.targetUid);
		gameClient.getRobot().notifyFriendDelete(notify.targetUid);
	}
	
	
}
