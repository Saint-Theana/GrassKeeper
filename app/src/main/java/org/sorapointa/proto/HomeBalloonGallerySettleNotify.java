package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BalloonGallerySettleInfo.*;
import org.sorapointa.proto.BalloonGallerySettleInfo;

public class HomeBalloonGallerySettleNotify {
    public enum HomeBalloonGallerySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4719) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer galleryId = null;
    @Tag(tag=8) public BalloonGallerySettleInfo settleInfo = null;
    @Tag(tag=3) public Integer rank = null;
    @Tag(tag=13) public Boolean isNewRecord = null;
}
