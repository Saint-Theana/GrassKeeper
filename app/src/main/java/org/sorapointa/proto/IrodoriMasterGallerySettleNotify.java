package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IrodoriMasterGallerySettleNotify {
    public enum IrodoriMasterGallerySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8194) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer galleryId = null;
    @Tag(tag=4) public IrodoriMasterGallerySettleInfo settleInfo = null;
}
