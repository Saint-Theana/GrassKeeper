package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassSchedule {
    @Tag(tag=11) public Integer scheduleId = null;
    @Tag(tag=10) public Integer level = null;
    @Tag(tag=7) public Integer point = null;
    @Tag(tag=5) public BattlePassCycle curCycle = null;
    @Tag(tag=8) public Integer beginTime = null;
    @Tag(tag=2) public Integer paidPlatformFlags = null;
    @Tag(tag=14) public Integer endTime = null;
    @Tag(tag=12) public Boolean isExtraPaidRewardTaken = null;
    @Tag(tag=3) public List<BattlePassRewardTag> rewardTakenList = new ArrayList<>();
    @Tag(tag=9) public Integer curCyclePoints = null;
    @Tag(tag=4) public Boolean isViewed = null;
    @Tag(tag=6) public Integer unlockStatus = null;
    @Tag(tag=15) public BattlePassProduct productInfo = null;
}
