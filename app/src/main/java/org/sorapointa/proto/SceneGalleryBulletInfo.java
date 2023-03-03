package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryBulletInfo {
    public static class MapHitCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer endTime = null;
    @Tag(tag=10) public List<MapHitCountMap> hitCountMap = new ArrayList<>();
}
