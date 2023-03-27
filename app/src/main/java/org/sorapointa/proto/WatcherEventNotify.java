package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherEventNotify {
    public enum WatcherEventNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2287) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer addProgress = null;
    @Tag(tag=15) public Integer watcherId = null;
}
