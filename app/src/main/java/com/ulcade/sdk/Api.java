package com.ulcade.sdk;

import java.util.List;

public interface Api
{
	void sendPrivateMessage(int uid,String text);

	void sendPrivateMessage(int uid,int icon);
	
	void sendChannelMessage(Integer channelId,String text);
	
	void sendChannelMessage(Integer channelId,int icon);
	
	void println(String message);
	
	void updateFriendList();
	
	List<FriendInfo> getFriendList();
	
	void dealAddFriendRequest(int uid,boolean accept);
	
	void dealHomeEnterRequest(int uid,boolean accept);
	
	void dealWorldEnterRequest(int uid,boolean accept);
	
	void requestAddFriend(int uid);
	
	void requestDeleteFriend(int uid);
}
