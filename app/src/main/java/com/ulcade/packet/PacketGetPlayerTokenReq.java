package com.ulcade.packet;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.crypto.RSAUtils;
import com.ulcade.util.Base64Utils;
import com.ulcade.util.Util;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.GetPlayerTokenReq;

public class PacketGetPlayerTokenReq extends BasePacket
{
	public PacketGetPlayerTokenReq(GameClient gameClient){
		super(gameClient);
	}
	

	@Override
	public int getOpcode()
	{
		return Opcode.GetPlayerTokenReq;
	}

	@Override
	protected byte[] getBody()
	{
		GetPlayerTokenReq getPlayerTokenReq=new GetPlayerTokenReq();
		getPlayerTokenReq.accountType=user.accountType;
		getPlayerTokenReq.accountToken= Util.bytesToHex(Base64Utils.decode(user.accountToken)).toLowerCase();
		getPlayerTokenReq.accountUid= user.uid+"";
		getPlayerTokenReq.platformType= clientConfig.platform;
		getPlayerTokenReq.channelId= clientConfig.channelId;
		try
		{
			getPlayerTokenReq.clientRandKey = Base64Utils.encode(RSAUtils.encryptByPublicKey(Util.hexToBytes(Long.toUnsignedString(gameClient.getClientSeed(),16)), Base64Utils.decode(clientConfig.dispatchPublicKey)));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		getPlayerTokenReq.keyId= clientConfig.rsaKeyId;
		return new ProtobufEncoder(getPlayerTokenReq).toByteArray();
	}
}
