package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityPushTipsData.*;
import org.sorapointa.proto.ActivityPushTipsData;

public class ActivityPushTipsInfoNotify {
    public enum ActivityPushTipsInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8527) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer scheduleId = null;
    @Tag(tag=7) public List<ActivityPushTipsData> activityPushTipsDataList = new ArrayList<>();
    @Tag(tag=9) public Integer activityId = null;
}
