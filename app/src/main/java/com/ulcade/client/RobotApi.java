package com.ulcade.client;
import com.ulcade.sdk.Api;
import java.util.List;
import com.ulcade.sdk.FriendInfo;

public class RobotApi implements Api
{

	@Override
	public void sendChannelMessage(Integer channelId, String text)
	{
		gameClient.sendChannelMessage(channelId,text);
	}

	@Override
	public void sendChannelMessage(Integer channelId, int icon)
	{
		gameClient.sendChannelMessage(channelId,icon);
	}


	@Override
	public void dealWorldEnterRequest(int uid, boolean accept)
	{
		gameClient.dealWorldEnterRequest(uid,accept);
	}


	@Override
	public void dealHomeEnterRequest(int uid, boolean accept)
	{
		gameClient.dealHomeEnterRequest(uid,accept);
	}


	@Override
	public void requestDeleteFriend(int uid)
	{
		gameClient.requestDeleteFriend(uid);
	}


	@Override
	public void requestAddFriend(int uid)
	{
		gameClient.requestAddFriend(uid);
	}


	@Override
	public void dealAddFriendRequest(int uid, boolean accept)
	{
		gameClient.dealAddFriendRequest(uid,accept);
	}

	@Override
	public void updateFriendList()
	{
		gameClient.updatePlayerFriendList();
	}

	@Override
	public List<FriendInfo> getFriendList()
	{
		return gameClient.getFriendList();
	}

	@Override
	public void println(String message)
	{
		System.out.println(message);
	}

	private GameClient gameClient;
	
	public RobotApi(GameClient gameClient){
		this.gameClient=gameClient;
	}

	@Override
	public void sendPrivateMessage(int uid, String text)
	{
		gameClient.sendPrivateMessage(uid,text);
	}

	@Override
	public void sendPrivateMessage(int uid, int icon)
	{
		gameClient.sendPrivateMessage(uid,icon);
	}
	
}
