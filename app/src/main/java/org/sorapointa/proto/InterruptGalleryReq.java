package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InterruptGalleryReq {
    public enum InterruptGalleryReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5578) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer galleryId = null;
}
