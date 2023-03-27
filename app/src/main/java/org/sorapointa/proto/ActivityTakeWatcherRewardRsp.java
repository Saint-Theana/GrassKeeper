package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeWatcherRewardRsp {
    public enum ActivityTakeWatcherRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2009) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public Integer watcherId = null;
    @Tag(tag=3) public Integer activityId = null;
}
