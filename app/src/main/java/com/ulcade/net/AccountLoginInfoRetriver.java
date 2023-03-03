package com.ulcade.net;

import com.ulcade.PublicConstant;
import com.ulcade.client.ClientConfig;
import com.ulcade.client.User;
import com.ulcade.crypto.RSAUtils;
import com.ulcade.info.LoginInfo;
import com.ulcade.info.LoginResultInfo;
import com.ulcade.util.Util;

public class AccountLoginInfoRetriver
{
	
	private User user;

	private ClientConfig clientInfo;

	public AccountLoginInfoRetriver(User user,ClientConfig clientInfo){
		this.user=user;
		this.clientInfo=clientInfo;
	}

	public LoginResultInfo process()
	{
		LoginInfo loginInfo=new LoginInfo();
		loginInfo.is_crypto=true;
		loginInfo.account=user.account;
		loginInfo.game_key=clientInfo.gameKey;
		loginInfo.password=RSAUtils.encryptByPublicKey(user.password,clientInfo.authPublicKey);
		String result =Http.httpPost(clientInfo.serverAddress+"/hk4e_global/mdk/shield/api/login",PublicConstant.gson.toJson(loginInfo));
		//System.out.println(result);
		return PublicConstant.gson.fromJson(result,LoginResultInfo.class);
	}
	
}
