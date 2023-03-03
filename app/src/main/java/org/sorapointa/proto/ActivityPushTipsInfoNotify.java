package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityPushTipsData.*;
import org.sorapointa.proto.ActivityPushTipsData;

public class ActivityPushTipsInfoNotify {
    @Tag(tag=14) public Integer scheduleId = null;
    @Tag(tag=3) public List<ActivityPushTipsData> activityPushTipsDataList = new ArrayList<>();
    @Tag(tag=10) public Integer activityId = null;
}
