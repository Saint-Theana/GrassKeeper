package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrokenFloorInfo {
    public static class MapFallCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public List<MapFallCountMap> fallCountMap = new ArrayList<>();
    @Tag(tag=10) public Integer endTime = null;
}
