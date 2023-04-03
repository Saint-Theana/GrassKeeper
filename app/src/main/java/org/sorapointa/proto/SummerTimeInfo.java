package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeSprintBoatInfo.*;
import org.sorapointa.proto.SummerTimeSprintBoatInfo;
import org.sorapointa.proto.SummerTimeStageInfo.*;
import org.sorapointa.proto.SummerTimeStageInfo;

public class SummerTimeInfo {
    public static class MapStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public SummerTimeStageInfo value = null;
    }

    @Tag(tag=11) public SummerTimeSprintBoatInfo sprintBoatInfo = null;
    @Tag(tag=6) public Integer contentCloseTime = null;
    @Tag(tag=2) public List<MapStageMap> stageMap = new ArrayList<>();
    @Tag(tag=9) public Boolean isContentClosed = null;
}
