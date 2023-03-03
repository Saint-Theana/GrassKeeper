package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerActivityDetailInfo {
    public static class MapWishFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapUsedFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public Boolean isContentClosed = null;
    @Tag(tag=10) public List<MapWishFlowerNumMap> wishFlowerNumMap = new ArrayList<>();
    @Tag(tag=11) public Integer todaySeedRewardId = null;
    @Tag(tag=1) public Integer dayIndex = null;
    @Tag(tag=13) public Boolean isTodayHasAwarded = null;
    @Tag(tag=7) public List<MapUsedFlowerNumMap> usedFlowerNumMap = new ArrayList<>();
}
