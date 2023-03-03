package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.crypto.RSAUtils;
import com.ulcade.util.Base64Utils;
import com.ulcade.util.Util;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.GetPlayerTokenReq;
import org.sorapointa.proto.EnterSceneDoneReq;

public class PacketEnterSceneDoneReq extends BasePacket
{
	private int enterSceneToken;

	public PacketEnterSceneDoneReq(GameClient gameClient){
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
		return Opcode.EnterSceneDoneReq;
	}

	@Override
	protected byte[] getBody()
	{
		EnterSceneDoneReq enterSceneDoneReq=new EnterSceneDoneReq();
		enterSceneDoneReq.enterSceneToken=enterSceneToken;
		return new ProtobufEncoder(enterSceneDoneReq).toByteArray();
	}
}
