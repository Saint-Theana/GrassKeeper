package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerFloorRecord {
    public static class MapPassedLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=4) public Integer floorStarRewardProgress = null;
    @Tag(tag=6) public List<MapPassedLevelMap> passedLevelMap = new ArrayList<>();
    @Tag(tag=7) public List<TowerLevelRecord> passedLevelRecordList = new ArrayList<>();
    @Tag(tag=15) public Integer floorId = null;
}
