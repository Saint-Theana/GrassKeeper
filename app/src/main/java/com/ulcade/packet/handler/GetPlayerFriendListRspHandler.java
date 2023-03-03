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
import org.sorapointa.proto.FriendBrief;
import org.sorapointa.proto.GetPlayerFriendListRsp;

public class GetPlayerFriendListRspHandler extends BaseHandler
{

	public GetPlayerFriendListRspHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}

	@Override
	public void process(byte[] header, byte[] payload)
	{
		GetPlayerFriendListRsp rsp = ProtobufDecoder.decodeFrom(new GetPlayerFriendListRsp(), payload);
		//System.err.println(PublicConstant.gson.toJson(rsp));
		List<FriendInfo> askFriendInfos =new ArrayList<FriendInfo>();
		for (FriendBrief breaf:rsp.askFriendList)
		{
			askFriendInfos.add(PublicConstant.gson.fromJson(PublicConstant.gson.toJson(breaf), FriendInfo.class));
		}
		if (askFriendInfos.size() > 0)
		{
			gameClient.getRobot().notifyFriendAsk(askFriendInfos);
		}
		List<FriendInfo> friendInfos =new ArrayList<FriendInfo>();
		for (FriendBrief breaf:rsp.friendList)
		{
			friendInfos.add(PublicConstant.gson.fromJson(PublicConstant.gson.toJson(breaf), FriendInfo.class));
		}
		gameClient.updatePlayerFriendList(friendInfos);
	}
}
