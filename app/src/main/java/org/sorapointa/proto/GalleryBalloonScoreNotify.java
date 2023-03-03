package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBalloonScoreNotify {
    public static class MapUidScoreMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=9) public Integer galleryId = null;
    @Tag(tag=7) public List<MapUidScoreMap> uidScoreMap = new ArrayList<>();
}
