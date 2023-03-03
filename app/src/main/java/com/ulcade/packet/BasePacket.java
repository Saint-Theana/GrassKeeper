package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import io.github.sainttheana.proto.util.ByteBuilder;
import org.sorapointa.proto.PacketHead;

public abstract class BasePacket
{
	
	protected User user;

	protected ClientConfig clientConfig;

	protected GameClient gameClient;
	
	public BasePacket(GameClient client){
		this.user=client.getUser();
		this.gameClient=client;
		this.clientConfig=client.getClientConfig();
	}
	
	public abstract int getOpcode();
	
	protected abstract byte[] getBody();
	
	public byte[] build(){
		ByteBuilder buf=new ByteBuilder();
		buf.writeShort(17767);
		buf.writeShort(getOpcode());
		byte[] header=getHead();
		byte[] body=getBody();
		//
		buf.writeShort(header.length);
		buf.writeInt(body.length);
		buf.writeBytes(header);
		buf.writeBytes(body);
		buf.writeShort(-30293);
		return buf.toByteArray(true);
		
	};
	
	protected byte[] getHead(){
		PacketHead packetHead =new PacketHead();
		packetHead.clientSequenceId = 1;
		packetHead.enetIsReliable=1;
		packetHead.sentMs= System.currentTimeMillis();
		return new ProtobufEncoder(packetHead).toByteArray();
	}
}
