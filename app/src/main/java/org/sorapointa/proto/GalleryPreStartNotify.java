package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GalleryPreStartNotify {
    public enum GalleryPreStartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5514) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public Integer preStartEndTime = null;
    @Tag(tag=7) public Integer galleryId = null;
}
