package com.ulcade.net;
import com.ulcade.PublicConstant;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.User;
import com.ulcade.info.ComboLoginResultInfo;
import com.ulcade.info.TokenLoginInfo;
import com.ulcade.util.Util;

public class AccountTokenLoginInfoRetriver
{
	private User user;

	private ClientConfig clientInfo;

	public AccountTokenLoginInfoRetriver(User user,ClientConfig clientInfo){
		this.user=user;
		this.clientInfo=clientInfo;
	}

	public ComboLoginResultInfo process()
	{
		TokenLoginInfo.LoginData data=new TokenLoginInfo.LoginData();
		data.uid=user.uid+"";
		data.token=user.accountToken;
		data.guest=false;
		data.country_code=user.countryCode;
		TokenLoginInfo info=new TokenLoginInfo();
		info.app_id=clientInfo.appId;
		info.channel_id=clientInfo.channelId;
		info.device=user.device;
		info.data=PublicConstant.gson.toJson(data);
		
//		try
//		{
//			Signature privateSignature = Signature.getInstance("SHA256withRSA");
//			privateSignature.initSign(KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(Base64Utils.decode(clientInfo.privateKey))));
//			privateSignature.update(regionInfo);
//		}
//		catch (Exception e)
//		{
//			e.printStackTrace();
//		}
		//System.out.println(PublicConstant.gson.toJson(info));
		String result = Http.httpPost(clientInfo.serverAddress + "/hk4e_global/combo/granter/login/v2/login", PublicConstant.gson.toJson(info));
		
		
		return PublicConstant.gson.fromJson(result,ComboLoginResultInfo.class);
	}
	
	
}
