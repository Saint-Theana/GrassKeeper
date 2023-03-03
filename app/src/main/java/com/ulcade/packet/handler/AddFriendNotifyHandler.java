package com.ulcade.packet.handler;

import com.ulcade.PublicConstant;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import com.ulcade.sdk.FriendInfo;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.AddFriendNotify;

public class AddFriendNotifyHandler extends BaseHandler
{

	public AddFriendNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		AddFriendNotify addFriendNotify =ProtobufDecoder.decodeFrom(new AddFriendNotify(),payload);
		//List<FriendInfo> infos=new ArrayList<FriendInfo>();
		FriendInfo info=PublicConstant.gson.fromJson(PublicConstant.gson.toJson(addFriendNotify.targetFriendBrief), FriendInfo.class);
		//infos.add(info);
		gameClient.updatePlayerFriendList();
		gameClient.getRobot().notifyFriendAdd(info);
	}

}
