package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityBannerClearRsp {
    public enum ActivityBannerClearRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2143) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer activityId = null;
    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
