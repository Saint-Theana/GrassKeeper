package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaInfo {
    public static class MapRobotNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapHaveRewardRobotNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=5) public Integer robotFinishNum = null;
    @Tag(tag=2) public List<MapRobotNumMap> robotNumMap = new ArrayList<>();
    @Tag(tag=14) public List<Integer> haveGetRobotList = new ArrayList<>();
    @Tag(tag=15) public List<MapHaveRewardRobotNumMap> haveRewardRobotNumMap = new ArrayList<>();
    @Tag(tag=8) public Integer techCreateRobotId = null;
    @Tag(tag=9) public List<GachaStageData> gachaStageDataList = new ArrayList<>();
}
