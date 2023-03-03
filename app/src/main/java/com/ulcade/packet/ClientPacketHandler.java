package com.ulcade.packet;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.GameClient;
import com.ulcade.client.User;
import com.ulcade.packet.handler.AddFriendNotifyHandler;
import com.ulcade.packet.handler.AskAddFriendNotifyHandler;
import com.ulcade.packet.handler.DealAddFriendRspHandler;
import com.ulcade.packet.handler.DeleteFriendNotifyHandler;
import com.ulcade.packet.handler.DeleteFriendRspHandler;
import com.ulcade.packet.handler.EnterWorldAreaRspHandler;
import com.ulcade.packet.handler.GetPlayerFriendListRspHandler;
import com.ulcade.packet.handler.GetPlayerTokenRspHandler;
import com.ulcade.packet.handler.PlayerApplyEnterHomeNotifyHandler;
import com.ulcade.packet.handler.PlayerApplyEnterMpNotifyHandler;
import com.ulcade.packet.handler.PlayerChatNotifyHandler;
import com.ulcade.packet.handler.PlayerEnterSceneNotifyHandler;
import com.ulcade.packet.handler.PlayerLoginRspHandler;
import com.ulcade.packet.handler.PlayerWorldSceneInfoListNotifyHandler;
import com.ulcade.packet.handler.PrivateChatNotifyHandler;
import com.ulcade.PublicConstant;

public class ClientPacketHandler
{
	GameClient gameClient;
	
	User user;
	
	ClientConfig clientConfig;

	public ClientPacketHandler(GameClient gameClient, User user, ClientConfig clientConfig)
	{
		this.gameClient = gameClient;
		this.user = user;
		this.clientConfig = clientConfig;
	}

	public void handle(int opcode, byte[] header, byte[] payload)
	{
		if(PublicConstant.printCmd){
		    System.out.println("recieve packet "+Opcode.getNameByValue(opcode));
		}
		switch(opcode){
			case Opcode.GetPlayerTokenRsp:
				new GetPlayerTokenRspHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PlayerLoginRsp:
				new PlayerLoginRspHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PrivateChatNotify:
				new PrivateChatNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.GetPlayerFriendListRsp:
				new GetPlayerFriendListRspHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.DeleteFriendNotify:
				new DeleteFriendNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.AskAddFriendNotify:
				new AskAddFriendNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.DealAddFriendRsp:
				new DealAddFriendRspHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.DeleteFriendRsp:
				new DeleteFriendRspHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.AddFriendNotify:
				new AddFriendNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PlayerWorldSceneInfoListNotify:
				new PlayerWorldSceneInfoListNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PlayerEnterSceneNotify:
				new PlayerEnterSceneNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.EnterWorldAreaRsp:
				new EnterWorldAreaRspHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PlayerApplyEnterHomeNotify:
				new PlayerApplyEnterHomeNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PlayerChatNotify:
				new PlayerChatNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
			case Opcode.PlayerApplyEnterMpNotify:
				new PlayerApplyEnterMpNotifyHandler(gameClient,user,clientConfig).process(header,payload);
				break;
		}
		
	}
	
}
