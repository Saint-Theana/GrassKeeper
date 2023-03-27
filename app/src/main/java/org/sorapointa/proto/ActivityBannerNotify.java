package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityBannerNotify {
    public enum ActivityBannerNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2005) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer scheduleId = null;
    @Tag(tag=6) public Integer activityId = null;
}
