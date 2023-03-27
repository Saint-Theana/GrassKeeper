package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerInfo {
    public static class MapWishFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapUsedFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14) public List<MapWishFlowerNumMap> wishFlowerNumMap = new ArrayList<>();
    @Tag(tag=8) public Integer dayIndex = null;
    @Tag(tag=2) public Boolean isTodayHasAwarded = null;
    @Tag(tag=1) public Boolean isContentClosed = null;
    @Tag(tag=11) public List<MapUsedFlowerNumMap> usedFlowerNumMap = new ArrayList<>();
    @Tag(tag=4) public Integer todaySeedRewardId = null;
}
