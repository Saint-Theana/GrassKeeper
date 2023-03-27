package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FriendBrief {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public String nickname = null;
    @Tag(tag=3) public Integer level = null;
    @Tag(tag=4) public Integer avatarId = null;
    @Tag(tag=5) public Integer worldLevel = null;
    @Tag(tag=6) public String signature = null;
    @Tag(tag=7) public Integer onlineState = null;
    @Tag(tag=8) public Integer param = null;
    @Tag(tag=10) public Boolean isMpModeAvailable = null;
    @Tag(tag=11) public String onlineId = null;
    @Tag(tag=12) public Integer lastActiveTime = null;
    @Tag(tag=13) public Integer nameCardId = null;
    @Tag(tag=14) public Integer mpPlayerNum = null;
    @Tag(tag=15) public Boolean isChatNoDisturb = null;
    @Tag(tag=16) public Integer chatSequence = null;
    @Tag(tag=17) public String remarkName = null;
    @Tag(tag=22) public List<SocialShowAvatarInfo> showAvatarInfoList = new ArrayList<>();
    @Tag(tag=23) public Integer friendEnterHomeOption = null;
    @Tag(tag=24) public ProfilePicture profilePicture = null;
    @Tag(tag=25) public Boolean isGameSource = null;
    @Tag(tag=26) public Boolean isPsnSource = null;
    @Tag(tag=27) public Integer platformType = null;
}
