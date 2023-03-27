package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeWatcherRewardReq {
    public enum ActivityTakeWatcherRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2124) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer activityId = null;
    @Tag(tag=6) public Integer watcherId = null;
}
