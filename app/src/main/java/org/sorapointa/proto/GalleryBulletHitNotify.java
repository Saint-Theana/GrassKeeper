package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBulletHitNotify {
    public enum GalleryBulletHitNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5524) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer hitCount = null;
    @Tag(tag=10) public Integer galleryId = null;
}
