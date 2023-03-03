package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import com.ulcade.packet.PacketEnterSceneDoneReq;
import com.ulcade.packet.PacketEnterSceneReadyReq;
import com.ulcade.packet.PacketEnterWorldAreaReq;
import com.ulcade.packet.PacketSceneInitFinishReq;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.PlayerEnterSceneNotify;

public class PlayerEnterSceneNotifyHandler extends BaseHandler
{

	public PlayerEnterSceneNotifyHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		//System.out.println("yes");
		PlayerEnterSceneNotify notify = ProtobufDecoder.decodeFrom(new PlayerEnterSceneNotify(), payload);
		PacketEnterSceneReadyReq aa=new PacketEnterSceneReadyReq(gameClient);
		aa.setEnterSceneToken(notify.enterSceneToken);
		gameClient.send(aa);
		PacketSceneInitFinishReq a=new PacketSceneInitFinishReq(gameClient);
		a.setEnterSceneToken(notify.enterSceneToken);
		PacketEnterSceneDoneReq b=new PacketEnterSceneDoneReq(gameClient);
		b.setEnterSceneToken(notify.enterSceneToken);
		gameClient.send(a);
		gameClient.send(b);
		PacketEnterWorldAreaReq c=new PacketEnterWorldAreaReq(gameClient);
		c.setAreaId(7);
		c.setAreaType(1);
		gameClient.send(c);
	}
}
