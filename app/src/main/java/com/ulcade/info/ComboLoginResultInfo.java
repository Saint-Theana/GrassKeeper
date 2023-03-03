package com.ulcade.info;

public class ComboLoginResultInfo
{
	public static class ResultData{
		public String combo_id;
		public String open_id;
		public int account_type;
		public String combo_token;
		public String data;
		public String fatigue_remind;
		public boolean heartbeat;
	}
	public ResultData data;
	public String message;
	public int retcode;

	
}
