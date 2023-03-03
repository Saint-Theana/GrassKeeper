package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryFallCatchNotify {
    public static class MapBallCatchCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public Integer curScore = null;
    @Tag(tag=11) public Integer timeCost = null;
    @Tag(tag=15) public List<MapBallCatchCountMap> ballCatchCountMap = new ArrayList<>();
    @Tag(tag=1) public Integer addScore = null;
    @Tag(tag=12) public Boolean isGround = null;
    @Tag(tag=10) public Integer galleryId = null;
}
