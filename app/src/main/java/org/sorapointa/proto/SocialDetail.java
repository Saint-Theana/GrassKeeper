package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SocialDetail {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public String nickname = null;
    @Tag(tag=3) public Integer level = null;
    @Tag(tag=4) public Integer avatarId = null;
    @Tag(tag=5) public String signature = null;
    @Tag(tag=6) public Birthday birthday = null;
    @Tag(tag=7) public Integer worldLevel = null;
    @Tag(tag=8) public List<Integer> reservedList = new ArrayList<>();
    @Tag(tag=9) public Integer onlineState = null;
    @Tag(tag=10) public Integer param = null;
    @Tag(tag=11) public Boolean isFriend = null;
    @Tag(tag=12) public Boolean isMpModeAvailable = null;
    @Tag(tag=13) public String onlineId = null;
    @Tag(tag=14) public Integer nameCardId = null;
    @Tag(tag=15) public Boolean isInBlacklist = null;
    @Tag(tag=16) public Boolean isChatNoDisturb = null;
    @Tag(tag=17) public String remarkName = null;
    @Tag(tag=18) public Integer finishAchievementNum = null;
    @Tag(tag=19) public Integer towerFloorIndex = null;
    @Tag(tag=20) public Integer towerLevelIndex = null;
    @Tag(tag=21) public Boolean isShowAvatar = null;
    @Tag(tag=22) public List<SocialShowAvatarInfo> showAvatarInfoList = new ArrayList<>();
    @Tag(tag=23) public List<Integer> showNameCardIdList = new ArrayList<>();
    @Tag(tag=24) public Integer friendEnterHomeOption = null;
    @Tag(tag=25) public ProfilePicture profilePicture = null;
    @Tag(tag=26) public String ipCode = null;
}
