package com.ulcade.packet.handler;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.crypto.Ec2b;
import com.ulcade.crypto.RSAUtils;
import com.ulcade.packet.BaseHandler;
import com.ulcade.packet.PacketPlayerLoginReq;
import com.ulcade.util.Util;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.GetPlayerTokenRsp;

public class GetPlayerTokenRspHandler extends BaseHandler
{

	public GetPlayerTokenRspHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		GetPlayerTokenRsp rsp=ProtobufDecoder.decodeFrom(new GetPlayerTokenRsp(), payload);
		byte[] seed = RSAUtils.decryptByPrivateKey(rsp.serverRandKey, clientConfig.privateKey);
		long serverSeed=Long.parseUnsignedLong(Util.bytesToHex(seed), 16);
		gameClient.setServerSeed(serverSeed);
		long newSeed= serverSeed ^ gameClient.getClientSeed();
		byte[] newXorkey=Ec2b.generateXorKey(newSeed);
		gameClient.setXorKey(newXorkey);
		gameClient.send(new PacketPlayerLoginReq(gameClient));

	}
}
