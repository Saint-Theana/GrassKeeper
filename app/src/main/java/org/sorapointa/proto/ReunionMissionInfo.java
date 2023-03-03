package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionWatcherInfo.*;
import org.sorapointa.proto.ReunionWatcherInfo;

public class ReunionMissionInfo {
    @Tag(tag=3) public List<ReunionWatcherInfo> curDayWatcherList = new ArrayList<>();
    @Tag(tag=11) public Integer curScore = null;
    @Tag(tag=8) public Boolean isTakenReward = null;
    @Tag(tag=6) public List<Boolean> isTakenRewardList = new ArrayList<>();
    @Tag(tag=5) public Integer nextRefreshTime = null;
    @Tag(tag=9) public Boolean isFinished = null;
    @Tag(tag=12) public Integer missionId = null;
    @Tag(tag=2) public List<ReunionWatcherInfo> watcherList = new ArrayList<>();
}
