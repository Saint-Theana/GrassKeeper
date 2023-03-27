package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryFallCatchNotify {
    public static class MapBallCatchCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum GalleryFallCatchNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5520) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer timeCost = null;
    @Tag(tag=4) public Integer addScore = null;
    @Tag(tag=2) public Integer galleryId = null;
    @Tag(tag=5) public Integer curScore = null;
    @Tag(tag=3) public Boolean isGround = null;
    @Tag(tag=15) public List<MapBallCatchCountMap> ballCatchCountMap = new ArrayList<>();
}
