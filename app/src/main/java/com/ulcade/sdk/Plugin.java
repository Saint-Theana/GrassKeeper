package com.ulcade.sdk;
import java.util.List;

public abstract class Plugin
{
	public final void setEnabled(boolean enabled)
	{
		this.enabled = enabled;
	}

	public final boolean isEnabled()
	{
		return enabled;
	}

	public abstract String name();
	
	public abstract void onChannelMessage(Integer channelId, int uid, int icon);

	public abstract void onChannelMessage(Integer channelId, int uid, String text);

	public abstract void onFriendAdd(FriendInfo fromJson);

	public abstract void onFriendDelete(int target_uid);
	
	public abstract void onFriendRequest(List<FriendInfo> askFriendInfos);
	
	public abstract void onHomeEnterRequest(int uid);
	
	public abstract void onWorldEnterRequest(int uid);
	
	public abstract void onUnRegister();

	public abstract void onRegister(Api api);
	
	public abstract void onPrivateMessage(int uid,String text);
	
	public abstract void onPrivateMessage(int uid,int icon);
	
	private boolean enabled;

	@Override
	public String toString()
	{
		return "Plugin[name: "+name()+",enabled: "+enabled+"]";
	}
	
	
	
	
}
