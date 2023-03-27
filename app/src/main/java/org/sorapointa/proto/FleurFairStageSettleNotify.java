package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairStageSettleNotify {
    public enum FleurFairStageSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5336) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer stageType = null;
    @Tag(tag=10) public GallerySettleInfo gallerySettleInfo = null;
    @Tag(tag=8) public BossSettleInfo bossSettleInfo = null;
}
