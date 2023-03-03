package com.ulcade.info;

public class LoginResultInfo
{
	
	public ResultData data;
	
	public String message;
	
	public int retcode;
	
	public static class ResultData{
		
		
		
		public AccountData account;
		public boolean device_grant_required;
		public boolean safe_mobile_required;
		public boolean realperson_required;
		public boolean reactivate_required;
		public boolean realname_operation;

		
	}
	
	
	public static class AccountData{
		public String uid;
		public String name;
		public String email;
		public String mobile;
		public String is_email_verify;
		public String realname;
		public String identity_card;
		public String token;
		public String safe_mobile;
		public String facebook_name;
		public String google_name;
		public String twitter_name;
		public String game_center_name;
		public String apple_name;
		public String sony_name;
		public String tap_name;
		public String country;
		public String reactivate_ticket;
		public String area_code;
		public String device_grant_ticket;
		public String steam_name;


	}
	
	
	
}
