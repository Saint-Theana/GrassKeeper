package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityScheduleInfo.*;
import org.sorapointa.proto.ActivityScheduleInfo;

public class ActivityScheduleInfoNotify {
    public enum ActivityScheduleInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2047) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<ActivityScheduleInfo> activityScheduleList = new ArrayList<>();
    @Tag(tag=11) public Integer remainFlySeaLampNum = null;
}
