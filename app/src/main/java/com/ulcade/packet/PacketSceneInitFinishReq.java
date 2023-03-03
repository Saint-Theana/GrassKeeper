package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.SceneInitFinishReq;

public class PacketSceneInitFinishReq extends BasePacket
{
	private int enterSceneToken;

	public PacketSceneInitFinishReq(GameClient gameClient){
		super(gameClient);
	}
	

	public void setEnterSceneToken(int enterSceneToken)
	{
		this.enterSceneToken = enterSceneToken;
	}

	public int getEnterSceneToken()
	{
		return enterSceneToken;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.SceneInitFinishReq;
	}

	@Override
	protected byte[] getBody()
	{
		SceneInitFinishReq sceneInitFinishReq=new SceneInitFinishReq();
		sceneInitFinishReq.enterSceneToken=enterSceneToken;
		return new ProtobufEncoder(sceneInitFinishReq).toByteArray();
	}
}
