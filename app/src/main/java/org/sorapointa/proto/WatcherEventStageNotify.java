package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WatcherEventStageNotify {
    public enum LLEOBAOBBNG {
        @Tag(tag=0) None ,
        @Tag(tag=2220) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer addProgress = null;
    @Tag(tag=13) public Integer watcherId = null;
    @Tag(tag=6) public Integer stage = null;
}
