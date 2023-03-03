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
import org.sorapointa.proto.PlayerApplyEnterMpNotify;

public class PlayerApplyEnterMpNotifyHandler extends BaseHandler
{

	public PlayerApplyEnterMpNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		PlayerApplyEnterMpNotify notify= ProtobufDecoder.decodeFrom(new PlayerApplyEnterMpNotify(),payload);
		gameClient.getRobot().notifyWorldEnterRequest(notify.srcPlayerInfo.uid);

	}
}
