package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DailyTaskDataNotify {
    public enum DailyTaskDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=183) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Boolean isTakenScoreReward = null;
    @Tag(tag=11) public Integer finishedNum = null;
    @Tag(tag=2) public Integer scoreRewardId = null;
}
