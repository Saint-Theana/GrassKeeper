package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ActivityScheduleInfo.*;
import org.sorapointa.proto.ActivityScheduleInfo;

public class GetActivityScheduleRsp {
    @Tag(tag=9) public List<ActivityScheduleInfo> activityScheduleList = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer remainFlySeaLampNum = null;
}
