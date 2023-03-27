package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherEventTypeNotify {
    public enum WatcherEventTypeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2298) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=13) public Integer addProgress = null;
    @Tag(tag=7) public Integer watcherTriggerType = null;
}
