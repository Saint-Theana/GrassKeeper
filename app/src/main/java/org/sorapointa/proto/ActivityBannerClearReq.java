package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityBannerClearReq {
    public enum ActivityBannerClearReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2198) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer scheduleId = null;
    @Tag(tag=3) public Integer activityId = null;
}
