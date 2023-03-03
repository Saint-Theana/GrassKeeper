package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.EnterSceneReadyReq;

public class PacketEnterSceneReadyReq extends BasePacket
{
	private int enterSceneToken;

	public PacketEnterSceneReadyReq(GameClient gameClient){
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
		return Opcode.EnterSceneReadyReq;
	}

	@Override
	protected byte[] getBody()
	{
		EnterSceneReadyReq enterSceneReadyReq=new EnterSceneReadyReq();
		enterSceneReadyReq.enterSceneToken=enterSceneToken;
		return new ProtobufEncoder(enterSceneReadyReq).toByteArray();
	}
}
