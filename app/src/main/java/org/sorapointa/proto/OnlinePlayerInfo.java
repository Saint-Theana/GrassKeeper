package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OnlinePlayerInfo {
    @Tag(tag=1) public Integer uid = null;
    @Tag(tag=2) public String nickname = null;
    @Tag(tag=3) public Integer playerLevel = null;
    @Tag(tag=4) public Integer avatarId = null;
    @Tag(tag=5) public Integer mpSettingType = null;
    @Tag(tag=6) public Integer curPlayerNumInWorld = null;
    @Tag(tag=7) public Integer worldLevel = null;
    @Tag(tag=8) public String onlineId = null;
    @Tag(tag=9) public Integer nameCardId = null;
    @Tag(tag=10) public List<Integer> blacklistUidList = new ArrayList<>();
    @Tag(tag=11) public String signature = null;
    @Tag(tag=12) public ProfilePicture profilePicture = null;
    @Tag(tag=13) public String psnId = null;
}
