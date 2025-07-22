package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import java.util.Date;
import org.sorapointa.proto.PingReq;
import org.sorapointa.proto.*;

public class PacketMarkMapReq extends BasePacket
{
    private int sceneId;
    
    private Vector pos;
	
	public PacketMarkMapReq(GameClient gameClient,int sceneId,Vector pos){
		super(gameClient);
		this.sceneId=sceneId;
		this.pos=pos;
	}
	
	
	
	@Override
	public int getOpcode()
	{
		return Opcode.MarkMapReq;
	}

	@Override
	protected byte[] getBody()
	{
		MarkMapReq req = new MarkMapReq();
	    req.mark=new MapMarkPoint();
	    req.mark.sceneId=sceneId;
	    req.mark.pos=pos;

		return new ProtobufEncoder(req).toByteArray();
	}

}
