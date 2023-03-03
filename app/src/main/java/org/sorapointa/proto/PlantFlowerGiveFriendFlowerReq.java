package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGiveFriendFlowerReq {
    public static class MapFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=11) public Integer scheduleId = null;
    @Tag(tag=13) public Integer uid = null;
    @Tag(tag=12) public List<MapFlowerNumMap> flowerNumMap = new ArrayList<>();
}
