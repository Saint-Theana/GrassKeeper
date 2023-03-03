package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GachaStageData.*;
import org.sorapointa.proto.GachaStageData;

public class GachaActivityDetailInfo {
    public static class MapHaveRewardRobotNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapRobotNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public List<Integer> haveGetRobotList = new ArrayList<>();
    @Tag(tag=4) public List<GachaStageData> gachaStageDataList = new ArrayList<>();
    @Tag(tag=8) public List<MapHaveRewardRobotNumMap> haveRewardRobotNumMap = new ArrayList<>();
    @Tag(tag=3) public Integer techCreateRobotId = null;
    @Tag(tag=5) public List<MapRobotNumMap> robotNumMap = new ArrayList<>();
    @Tag(tag=12) public Integer robotFinishNum = null;
}
