package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.crypto.RSAUtils;
import com.ulcade.util.Base64Utils;
import com.ulcade.util.Util;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.GetPlayerTokenReq;
import org.sorapointa.proto.EnterWorldAreaReq;

public class PacketEnterWorldAreaReq extends BasePacket
{
	private int areaId;

	private int areaType;

	public PacketEnterWorldAreaReq(GameClient gameClient){
		super(gameClient);
	}
	

	public void setAreaId(int areaId)
	{
		this.areaId = areaId;
	}

	public int getAreaId()
	{
		return areaId;
	}

	public void setAreaType(int areaType)
	{
		this.areaType = areaType;
	}

	public int getAreaType()
	{
		return areaType;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.EnterWorldAreaReq;
	}

	@Override
	protected byte[] getBody()
	{
		EnterWorldAreaReq enterWorldAreaReq=new EnterWorldAreaReq();
		enterWorldAreaReq.areaId=areaId;
		enterWorldAreaReq.areaType=areaType;
		return new ProtobufEncoder(enterWorldAreaReq).toByteArray();
	}
}
