package com.ulcade.net;

import com.ulcade.PublicConstant;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.User;
import com.ulcade.crypto.RSAUtils;
import com.ulcade.info.CurrentRegionInfo;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import org.sorapointa.proto.QueryCurrRegionHttpRsp;

public class CurrentRegionInfoRetriver
{
	
	private User user;

	private ClientConfig clientInfo;

	public CurrentRegionInfoRetriver(User user,ClientConfig clientInfo){
		this.user=user;
		this.clientInfo=clientInfo;
	}

	public QueryCurrRegionHttpRsp process(String dispatchUrl)
	{
		StringBuilder url=new StringBuilder();
		url.append(dispatchUrl);
		url.append("?version="+clientInfo.version);
		url.append("&lang="+clientInfo.lang);
		url.append("&platform="+clientInfo.platform);
		url.append("&binary="+clientInfo.binary);
		url.append("&time="+clientInfo.time);
		url.append("&channel_id="+clientInfo.channelId);
		url.append("&sub_channel_id="+clientInfo.subChannelId);
		url.append("&account_type="+user.accountType);
		url.append("&dispatchSeed="+clientInfo.dispatchSeed);
		url.append("&key_id="+clientInfo.rsaKeyId);
		String data=Http.httpGet(url.toString());
		CurrentRegionInfo regionInfo=PublicConstant.gson.fromJson(data,CurrentRegionInfo.class);
	    byte[] decrypted=RSAUtils.decryptByPrivateKey(regionInfo.content,clientInfo.privateKey);
		return ProtobufDecoder.decodeFrom(new QueryCurrRegionHttpRsp(),decrypted);
		
	}

	
}
