package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeWatcherRewardBatchReq {
    public enum ActivityTakeWatcherRewardBatchReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2083) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=2) public Integer activityId = null;
}
