package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryInfoNotify {
    public enum SceneGalleryInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5513) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public SceneGalleryInfo galleryInfo = null;
}
