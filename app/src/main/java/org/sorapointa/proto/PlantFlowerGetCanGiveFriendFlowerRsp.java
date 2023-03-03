package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerGetCanGiveFriendFlowerRsp {
    public static class MapFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public List<MapFlowerNumMap> flowerNumMap = new ArrayList<>();
    @Tag(tag=4) public Integer scheduleId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
