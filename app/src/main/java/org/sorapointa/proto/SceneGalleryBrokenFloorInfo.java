package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryBrokenFloorInfo {
    public static class MapFallCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public List<MapFallCountMap> fallCountMap = new ArrayList<>();
    @Tag(tag=9) public Integer endTime = null;
}
