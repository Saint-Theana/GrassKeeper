package com.ulcade.packet.handler;

import com.ulcade.PublicConstant;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import com.ulcade.sdk.FriendInfo;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import java.util.ArrayList;
import java.util.List;
import org.sorapointa.proto.AskAddFriendNotify;

public class AskAddFriendNotifyHandler extends BaseHandler
{

	public AskAddFriendNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		AskAddFriendNotify notify= ProtobufDecoder.decodeFrom(new AskAddFriendNotify(),payload);
		List<FriendInfo> list=new ArrayList<>();
		list.add(PublicConstant.gson.fromJson(PublicConstant.gson.toJson(notify.targetFriendBrief),FriendInfo.class));
		gameClient.getRobot().notifyFriendAsk(list);
		
		
	}

}
