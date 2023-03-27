package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryFlowerCatchNotify {
    public enum GalleryFlowerCatchNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5562) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer addScore = null;
    @Tag(tag=8) public Integer curScore = null;
    @Tag(tag=13) public Integer galleryId = null;
}
