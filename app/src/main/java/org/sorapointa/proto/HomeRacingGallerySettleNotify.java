package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RacingGallerySettleInfo.*;
import org.sorapointa.proto.RacingGallerySettleInfo;

public class HomeRacingGallerySettleNotify {
    public enum HomeRacingGallerySettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4671) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public RacingGallerySettleInfo settleInfo = null;
    @Tag(tag=4) public Integer galleryId = null;
    @Tag(tag=1) public Integer rank = null;
    @Tag(tag=5) public Boolean isNewRecord = null;
}
