package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.PrivateChatReq;

public class PacketPrivateChatReq extends BasePacket
{
    private Integer targetUid=null;
	
	private Integer icon=null;
	
	private String text=null;

	public PacketPrivateChatReq(GameClient gameClient){
		super(gameClient);
	}
	
	public void setText(String text)
	{
		this.text = text;
	}

	public void setTargetUid(int targetUid)
	{
		this.targetUid = targetUid;
	}

	public int getTargetUid()
	{
		return targetUid;
	}

	public void setIcon(int icon)
	{
		this.icon = icon;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.PrivateChatReq;
	}

	@Override
	protected byte[] getBody()
	{
		if(targetUid==null){
			throw new IllegalStateException("targetUin must not be null.");
		}
		if(icon==null&&text==null){
			throw new IllegalStateException("one of text or icon must not be null.");
		}else if(icon!=null&&text!=null){
			throw new IllegalStateException("one of text or icon must be null.");
		}
		PrivateChatReq privateChatReq =new PrivateChatReq();
		privateChatReq.targetUid=targetUid;
		privateChatReq.icon=icon;
		privateChatReq.text=text;
		return new ProtobufEncoder(privateChatReq).toByteArray();
		
	}
	
}
