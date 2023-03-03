package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import java.util.Date;

public class PacketGetPlayerFriendListReq extends BasePacket
{
	public PacketGetPlayerFriendListReq(GameClient gameClient){
		super(gameClient);
	}
	

	@Override
	public int getOpcode()
	{
		return Opcode.GetPlayerFriendListReq;
	}

	@Override
	protected byte[] getBody()
	{
		return new byte[0];
	}

}
