package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.PlayerApplyEnterHomeResultReq;
import org.sorapointa.proto.PrivateChatReq;

public class PacketPlayerApplyEnterHomeResultReq extends BasePacket
{
	private int targetUid;
	
	private boolean accept;

	public PacketPlayerApplyEnterHomeResultReq(GameClient gameClient){
		super(gameClient);
	}
	

	public void setAccept(boolean accept)
	{
		this.accept = accept;
	}

	public boolean isAccept()
	{
		return accept;
	}

	public void setTargetUid(int targetUid)
	{
		this.targetUid = targetUid;
	}

	public int getTargetUid()
	{
		return targetUid;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.PlayerApplyEnterHomeResultReq;
	}

	@Override
	protected byte[] getBody()
	{
		PlayerApplyEnterHomeResultReq playerApplyEnterHomeResultReq =new PlayerApplyEnterHomeResultReq();
		playerApplyEnterHomeResultReq.applyUid=targetUid;
		playerApplyEnterHomeResultReq.isAgreed=accept;
		return new ProtobufEncoder(playerApplyEnterHomeResultReq).toByteArray();

	}

}
