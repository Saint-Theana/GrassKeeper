package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBounceConjuringHitNotify {
    public enum GalleryBounceConjuringHitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5569) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Boolean isPerfect = null;
    @Tag(tag=7) public Integer galleryId = null;
    @Tag(tag=14) public Integer addScore = null;
}
