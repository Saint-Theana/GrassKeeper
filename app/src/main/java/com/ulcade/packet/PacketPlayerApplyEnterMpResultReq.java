package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.PlayerApplyEnterHomeResultReq;
import org.sorapointa.proto.PlayerApplyEnterMpResultReq;

public class PacketPlayerApplyEnterMpResultReq extends BasePacket
{
	private int targetUid;

	private boolean accept;



	public PacketPlayerApplyEnterMpResultReq(GameClient gameClient){
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
		return Opcode.PlayerApplyEnterMpResultReq;
	}

	@Override
	protected byte[] getBody()
	{
		PlayerApplyEnterMpResultReq playerApplyEnterMpResultReq =new PlayerApplyEnterMpResultReq();
		playerApplyEnterMpResultReq.applyUid=targetUid;
		playerApplyEnterMpResultReq.isAgreed=accept;
		return new ProtobufEncoder(playerApplyEnterMpResultReq).toByteArray();

	}

}
