package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.DeleteFriendNotify;

public class DeleteFriendNotifyHandler extends BaseHandler
{

	public DeleteFriendNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		DeleteFriendNotify notify=ProtobufDecoder.decodeFrom(new DeleteFriendNotify(),payload);
		gameClient.deleteFriendByUid(notify.targetUid);
		gameClient.getRobot().notifyFriendDelete(notify.targetUid);
	}
	
	
}
