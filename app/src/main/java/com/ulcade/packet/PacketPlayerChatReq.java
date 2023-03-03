package com.ulcade.packet;

import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufEncoder;
import org.sorapointa.proto.PlayerChatReq;
import org.sorapointa.proto.PrivateChatReq;
import org.sorapointa.proto.ChatInfo;

public class PacketPlayerChatReq extends BasePacket
{
	private Integer channelId=null;

	private Integer icon=null;

	private String text=null;

	public PacketPlayerChatReq(GameClient gameClient){
		super(gameClient);
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public void setChannelId(Integer targetUid)
	{
		this.channelId = targetUid;
	}

	public int getTargetUid()
	{
		return channelId;
	}

	public void setIcon(int icon)
	{
		this.icon = icon;
	}

	@Override
	public int getOpcode()
	{
		return Opcode.PlayerChatReq;
	}

	@Override
	protected byte[] getBody()
	{
		if(icon==null&&text==null){
			throw new IllegalStateException("one of text or icon must not be null.");
		}else if(icon!=null&&text!=null){
			throw new IllegalStateException("one of text or icon must be null.");
		}
		PlayerChatReq playerChatReq =new PlayerChatReq();
		playerChatReq.channelId=channelId;
		ChatInfo info=new ChatInfo();
		info.icon=icon;
		info.text=text;
		playerChatReq.chatInfo=info;
		return new ProtobufEncoder(playerChatReq).toByteArray();
	}

}
