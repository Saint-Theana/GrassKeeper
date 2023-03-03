package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BattlePassCycle.*;
import org.sorapointa.proto.BattlePassCycle;
import org.sorapointa.proto.BattlePassProduct.*;
import org.sorapointa.proto.BattlePassProduct;
import org.sorapointa.proto.BattlePassRewardTag.*;
import org.sorapointa.proto.BattlePassRewardTag;
import org.sorapointa.proto.BattlePassUnlockStatus.*;
import org.sorapointa.proto.BattlePassUnlockStatus;

public class BattlePassSchedule {
    @Tag(tag=14) public Integer level = null;
    @Tag(tag=2) public Integer beginTime = null;
    @Tag(tag=15) public Integer endTime = null;
    @Tag(tag=1) public Integer point = null;
    @Tag(tag=4) public BattlePassCycle curCycle = null;
    @Tag(tag=7) public Integer unlockStatus = null;
    @Tag(tag=11) public List<BattlePassRewardTag> rewardTakenList = new ArrayList<>();
    @Tag(tag=10) public Integer curCyclePoints = null;
    @Tag(tag=12) public Integer paidPlatformFlags = null;
    @Tag(tag=13) public BattlePassProduct productInfo = null;
    @Tag(tag=6) public Boolean isExtraPaidRewardTaken = null;
    @Tag(tag=3) public Boolean isViewed = null;
    @Tag(tag=9) public Integer scheduleId = null;
}
