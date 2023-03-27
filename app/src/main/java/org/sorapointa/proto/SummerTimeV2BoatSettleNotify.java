package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeV2BoatSettleNotify {
    public enum SummerTimeV2BoatSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8520) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public SummerTimeV2BoatGallerySettleInfo settleInfo = null;
    @Tag(tag=14) public Integer stageId = null;
    @Tag(tag=10) public Integer galleryId = null;
    @Tag(tag=12) public Boolean isNewRecord = null;
}
