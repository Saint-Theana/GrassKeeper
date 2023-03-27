package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class InterruptGalleryRsp {
    public enum InterruptGalleryRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5516) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer galleryId = null;
}
