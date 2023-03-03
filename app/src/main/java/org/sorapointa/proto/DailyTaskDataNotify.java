package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DailyTaskDataNotify {
    @Tag(tag=11) public Integer scoreRewardId = null;
    @Tag(tag=4) public Integer finishedNum = null;
    @Tag(tag=9) public Boolean isTakenScoreReward = null;
}
