package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.util.Base64Utils;
import com.ulcade.util.Util;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.PlayerLoginReq;

public class PacketPlayerLoginReq extends BasePacket
{

	public PacketPlayerLoginReq(GameClient gameClient){
		super(gameClient);
	}
	

	@Override
	public int getOpcode()
	{
		return Opcode.PlayerLoginReq;
	}

	@Override
	protected byte[] getBody()
	{
		PlayerLoginReq pleyerLoginReq=new PlayerLoginReq();
		pleyerLoginReq.deviceInfo=user.deviceInfo;
		pleyerLoginReq.accountUid=user.uid+"";
		pleyerLoginReq.deviceUuid=user.device;
		pleyerLoginReq.languageType=clientConfig.lang;
		pleyerLoginReq.deviceName=user.deviceName;
		pleyerLoginReq.systemVersion=user.systemVersion;
		pleyerLoginReq.clientVersion=clientConfig.clientVersion;
		pleyerLoginReq.accountType=user.accountType;
		pleyerLoginReq.platformType=clientConfig.platform;
		pleyerLoginReq.token=Util.bytesToHex(Base64Utils.decode(user.accountToken)).toLowerCase();
		pleyerLoginReq.clientPort=gameClient.getPort();
		pleyerLoginReq.regPlatform=user.regPlatform;
		pleyerLoginReq.clientDataVersion=gameClient.getCurrentRegionInfo().regionInfo.clientDataVersion;
		pleyerLoginReq.checksumClientVersion=clientConfig.version;
		pleyerLoginReq.channelId=clientConfig.channelId;
		//pleyerLoginReq.extra_bin_data=null;
		pleyerLoginReq.checksum=clientConfig.chacksum;
		pleyerLoginReq.clientToken=(int)clientConfig.clientToken;
		pleyerLoginReq.clientVerisonHash=clientConfig.clientVersionHash;
		pleyerLoginReq.tag=1;
		//pleyerLoginReq.security_cmd_reply=
		pleyerLoginReq.environmentErrorCode=clientConfig.environmentErrorCode.getBytes();

		return new ProtobufEncoder(pleyerLoginReq).toByteArray();
	}
	
	
}
