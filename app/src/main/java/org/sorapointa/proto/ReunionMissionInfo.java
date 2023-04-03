package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ReunionWatcherInfo.*;
import org.sorapointa.proto.ReunionWatcherInfo;

public class ReunionMissionInfo {
    @Tag(tag=7) public Integer missionId = null;
    @Tag(tag=15) public List<Boolean> isTakenRewardList = new ArrayList<>();
    @Tag(tag=3) public Boolean isTakenReward = null;
    @Tag(tag=4) public Integer curScore = null;
    @Tag(tag=2) public Boolean isFinished = null;
    @Tag(tag=13) public List<ReunionWatcherInfo> watcherList = new ArrayList<>();
    @Tag(tag=1) public List<ReunionWatcherInfo> curDayWatcherList = new ArrayList<>();
    @Tag(tag=6) public Integer nextRefreshTime = null;
}
