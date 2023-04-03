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

    public enum GalleryFallScoreNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5574) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer galleryId = null;
    @Tag(tag=4) public List<MapUidBriefMap> uidBriefMap = new ArrayList<>();
}
