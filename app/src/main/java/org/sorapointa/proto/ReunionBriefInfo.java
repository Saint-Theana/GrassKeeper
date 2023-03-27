package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionBriefInfo {
    @Tag(tag=15) public Integer privilegeId = null;
    @Tag(tag=5) public Integer finishTime = null;
    @Tag(tag=11) public Integer missionId = null;
    @Tag(tag=14) public Boolean missionHasReward = null;
    @Tag(tag=8) public ReunionPrivilegeInfo privilegeInfo = null;
    @Tag(tag=13) public Boolean isTakenFirstGift = null;
    @Tag(tag=7) public String version = null;
    @Tag(tag=9) public Integer firstGiftRewardId = null;
    @Tag(tag=1) public Integer firstDayStartTime = null;
    @Tag(tag=10) public Integer startTime = null;
    @Tag(tag=6) public Integer signInConfigId = null;
    @Tag(tag=2) public Boolean signInHasReward = null;
}
