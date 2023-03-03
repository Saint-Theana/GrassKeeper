package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.DealAddFriendReq;

public class PacketDealAddFriendReq extends BasePacket
{
	private int uid;
	
	private boolean accept;

	public PacketDealAddFriendReq(GameClient gameClient){
		super(gameClient);
	}
	

	public void setUid(int uid)
	{
		this.uid = uid;
	}

	public void setAccept(boolean accept)
	{
		this.accept = accept;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.DealAddFriendReq;
	}

	@Override
	protected byte[] getBody()
	{
		DealAddFriendReq dealAddFriendReq=new DealAddFriendReq();
		dealAddFriendReq.targetUid=uid;
		dealAddFriendReq.dealAddFriendResult=accept? 1: 0;
		return new ProtobufEncoder(dealAddFriendReq).toByteArray();
	}

}
