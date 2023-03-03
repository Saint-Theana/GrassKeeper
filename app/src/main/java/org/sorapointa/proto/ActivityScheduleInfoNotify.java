package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityScheduleInfo.*;
import org.sorapointa.proto.ActivityScheduleInfo;

public class ActivityScheduleInfoNotify {
    @Tag(tag=12) public List<ActivityScheduleInfo> activityScheduleList = new ArrayList<>();
    @Tag(tag=6) public Integer remainFlySeaLampNum = null;
}
