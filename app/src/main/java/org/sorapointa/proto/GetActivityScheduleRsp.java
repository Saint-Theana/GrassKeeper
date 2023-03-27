package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetActivityScheduleRsp {
    public enum GetActivityScheduleRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2015) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer remainFlySeaLampNum = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=12) public List<ActivityScheduleInfo> activityScheduleList = new ArrayList<>();
}
