package com.ulcade.sdk;
import java.util.ArrayList;
import java.util.List;

public class FriendInfo
{
	public Integer uid = null;
	public String nickname = null;
	public Integer level = null;
	public Integer avatar_id = null;
	public Integer world_level = null;
	public String signature = null;
	public Integer online_state = null;
	public Integer param = null;
	public Boolean is_mp_mode_available = null;
	public String online_id = null;
	public Integer last_active_time = null;
	public Integer name_card_id = null;
	public Integer mp_player_num = null;
	public Boolean is_chat_no_disturb = null;
	public Integer chat_sequence = null;
	public String remark_name = null;
	public List<SocialShowAvatarInfo> show_avatar_info_list = new ArrayList<>();
	public Integer friend_enter_home_option = null;
	public ProfilePicture profile_picture = null;
	public Boolean is_game_source = null;
	public Boolean is_psn_source = null;
	public Integer platform_type = null;

	public static class ProfilePicture
	{
		public Integer avatar_id = null;
		public Integer costume_id = null;
	}

	public static class SocialShowAvatarInfo
	{
		public Integer avatar_id = null;
		public Integer level = null;
		public Integer costume_id = null;
	}
}
