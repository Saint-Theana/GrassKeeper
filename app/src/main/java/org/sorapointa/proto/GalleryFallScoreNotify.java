package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FallPlayerBrief.*;
import org.sorapointa.proto.FallPlayerBrief;

public class GalleryFallScoreNotify {
    public static class MapUidBriefMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FallPlayerBrief value = null;
    }

    @Tag(tag=7) public Integer galleryId = null;
    @Tag(tag=1) public List<MapUidBriefMap> uidBriefMap = new ArrayList<>();
}
