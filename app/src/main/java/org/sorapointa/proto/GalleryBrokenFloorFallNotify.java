package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryBrokenFloorFallNotify {
    public enum GalleryBrokenFloorFallNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5529) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer fallCount = null;
    @Tag(tag=6) public Integer galleryId = null;
}
