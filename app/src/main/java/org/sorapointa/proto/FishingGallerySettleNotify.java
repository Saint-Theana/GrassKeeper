package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FishingGallerySettleNotify {
    public enum FishingGallerySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8356) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public FishingGallerySettleInfo settleInfo = null;
    @Tag(tag=7) public Integer galleryId = null;
    @Tag(tag=6) public Integer levelId = null;
}
