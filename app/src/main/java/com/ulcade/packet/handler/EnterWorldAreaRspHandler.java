package com.ulcade.packet.handler;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.BaseHandler;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.EnterWorldAreaRsp;
import com.ulcade.PublicConstant;

public class EnterWorldAreaRspHandler extends BaseHandler
{

	public EnterWorldAreaRspHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		super(gameClient, user, clientConfig);
	}


	@Override
	public void process(byte[] header, byte[] payload)
	{
		EnterWorldAreaRsp rsp=ProtobufDecoder.decodeFrom(new EnterWorldAreaRsp(),payload);
	   // System.out.println(PublicConstant.gson.toJson(rsp));
	}
}
