package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeSprintBoatInfo.*;
import org.sorapointa.proto.SummerTimeSprintBoatInfo;
import org.sorapointa.proto.SummerTimeStageInfo.*;
import org.sorapointa.proto.SummerTimeStageInfo;

public class SummerTimeDetailInfo {
    public static class MapStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public SummerTimeStageInfo value = null;
    }

    @Tag(tag=3) public List<MapStageMap> stageMap = new ArrayList<>();
    @Tag(tag=11) public Integer contentCloseTime = null;
    @Tag(tag=13) public Boolean isContentClosed = null;
    @Tag(tag=4) public SummerTimeSprintBoatInfo sprintBoatInfo = null;
}
