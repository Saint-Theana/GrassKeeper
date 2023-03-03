package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.DeleteFriendReq;

public class PacketDeleteFriendReq extends BasePacket
{
	private int uid;

	public PacketDeleteFriendReq(GameClient gameClient){
		super(gameClient);
	}
	

	public void setUid(int uid)
	{
		this.uid = uid;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.DeleteFriendReq;
	}

	@Override
	protected byte[] getBody()
	{
		DeleteFriendReq deleteFriendReq =new DeleteFriendReq();
		deleteFriendReq.targetUid = uid;
		return new ProtobufEncoder(deleteFriendReq).toByteArray();
	}
}
