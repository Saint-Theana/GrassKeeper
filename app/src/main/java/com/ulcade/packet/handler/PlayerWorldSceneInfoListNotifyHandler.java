package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.PlayerWorldSceneInfo;
import org.sorapointa.proto.PlayerWorldSceneInfoListNotify;

public class PlayerWorldSceneInfoListNotifyHandler extends BaseHandler
{

	public PlayerWorldSceneInfoListNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		PlayerWorldSceneInfoListNotify notify = ProtobufDecoder.decodeFrom(new PlayerWorldSceneInfoListNotify(), payload);
		
		for(PlayerWorldSceneInfo info: notify.infoList){
			
		}
	}
}
