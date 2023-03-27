package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBalloonScoreNotify {
    public static class MapUidScoreMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum GalleryBalloonScoreNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5587) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<MapUidScoreMap> uidScoreMap = new ArrayList<>();
    @Tag(tag=2) public Integer galleryId = null;
}
