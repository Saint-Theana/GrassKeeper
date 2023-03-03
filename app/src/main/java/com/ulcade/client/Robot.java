package com.ulcade.client;

import com.ulcade.sdk.Plugin;
import java.util.ArrayList;
import java.util.List;
import com.ulcade.sdk.Api;
import com.ulcade.sdk.FriendInfo;

public class Robot
{
	private List<Plugin> plugins;

	private GameClient client;

	private Api api;

	public void notifyWorldEnterRequest(int uid)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onWorldEnterRequest(uid);
			}
		}
	}

	public void onChannelMessage(int channelId, int uid, Integer icon)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onChannelMessage(channelId,uid,icon);
			}
		}
	}

	public void onChannelMessage(Integer channelId, Integer uid, String text)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onChannelMessage(channelId,uid,text);
			}
		}
	}

	
	public void notifyHomeEnterRequest(Integer uid)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onHomeEnterRequest(uid);
			}
		}
	}

	public void notifyFriendAdd(FriendInfo fromJson)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onFriendAdd(fromJson);
			}
		}
	}

	public void notifyFriendDelete(int target_uid)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onFriendDelete(target_uid);
			}
		}
	}

	public void notifyFriendAsk(List<FriendInfo> askFriendInfos)
	{
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onFriendRequest(askFriendInfos);
			}
		}
	}
	
	public void onPrivateMessage(int uid,int icon){
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onPrivateMessage(uid,icon);
			}
		}
	}
	
	public void onPrivateMessage(int uid,String text){
		for(Plugin plugin:plugins){
			if(plugin.isEnabled()){
			    plugin.onPrivateMessage(uid,text);
			}
		}
	}
	
	public Robot(GameClient client)
    {
        this.client = client;
		this.plugins=new ArrayList<Plugin>();
		this.api = new RobotApi(client);
	}
	
	public void registerPlugin(Plugin plugin)
    {
		if(plugins.contains(plugin)){
			throw new RuntimeException("cannot register same plugin twice.");
		}
		plugins.add(plugin);
        plugin.onRegister(api);
    }
	
	public void unRegisterAllPlugin()
    {
        for(Plugin plugin:plugins){
            plugin.onUnRegister();
        }
		plugins.clear();
    }
	
	public void unRegisterPlugin(Plugin plugin)
    {
		if(!plugins.contains(plugin)){
			throw new RuntimeException("cannot unregister a plugin that is not registered.");
		}
        plugin.onUnRegister();
        plugins.remove(plugin);
    }
}
