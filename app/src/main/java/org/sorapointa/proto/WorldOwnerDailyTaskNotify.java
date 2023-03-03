package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DailyTaskInfo.*;
import org.sorapointa.proto.DailyTaskInfo;

public class WorldOwnerDailyTaskNotify {
    @Tag(tag=2) public Integer filterCityId = null;
    @Tag(tag=1) public List<DailyTaskInfo> taskList = new ArrayList<>();
}
