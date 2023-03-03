package com.ulcade.net;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.User;
import io.github.sainttheana.proto.core.ProtobufDecoder;
import java.util.Base64;
import org.sorapointa.proto.QueryRegionListHttpRsp;

public class RegionInfoRetriver
{
	
	private User user;

	private ClientConfig clientInfo;

	public RegionInfoRetriver(User user,ClientConfig clientInfo){
		this.user=user;
		this.clientInfo=clientInfo;
	}
	
	
	
	public QueryRegionListHttpRsp process(){
		StringBuilder url=new StringBuilder();
		url.append(clientInfo.serverAddress);
		url.append("/query_region_list");
		url.append("?version="+clientInfo.version);
		url.append("&lang="+clientInfo.lang);
		url.append("&platform="+clientInfo.platform);
		url.append("&binary="+clientInfo.binary);
		url.append("&time="+clientInfo.time);
		url.append("&channel_id="+clientInfo.channelId);
		url.append("&sub_channel_id="+clientInfo.subChannelId);
		String regionList=Http.httpGet(url.toString());
		//System.out.
		return ProtobufDecoder.decodeFrom(new QueryRegionListHttpRsp(),Base64.getDecoder().decode(regionList));
		
		
	}
}
