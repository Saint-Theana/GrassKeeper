package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import java.util.Date;
import org.sorapointa.proto.PingReq;

public class PacketPingReq extends BasePacket
{
	
	public PacketPingReq(GameClient gameClient){
		super(gameClient);
	}
	
	
	
	@Override
	public int getOpcode()
	{
		return Opcode.PingReq;
	}

	@Override
	protected byte[] getBody()
	{
		PingReq pingReq=new PingReq();
		pingReq.clientTime=(int)new Date().getTime();
		pingReq.totalTickTime=gameClient.getTotalTickTime();
		pingReq.ueTime=gameClient.getUeTime();
		return new ProtobufEncoder(pingReq).toByteArray();
	}

}
