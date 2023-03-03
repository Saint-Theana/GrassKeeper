package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.AskAddFriendReq;

public class PacketAskAddFriendReq extends BasePacket
{
	private int uid;

	public PacketAskAddFriendReq(GameClient gameClient){
		super(gameClient);
	}
	

	public void setUid(int uid)
	{
		this.uid = uid;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.AskAddFriendReq;
	}

	@Override
	protected byte[] getBody()
	{
		AskAddFriendReq askAddFriendReq =new AskAddFriendReq();
		askAddFriendReq.targetUid = uid;
		return new ProtobufEncoder(askAddFriendReq).toByteArray();
	}
}
