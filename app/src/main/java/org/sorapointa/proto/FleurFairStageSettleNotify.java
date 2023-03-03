package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairBossSettleInfo.*;
import org.sorapointa.proto.FleurFairBossSettleInfo;
import org.sorapointa.proto.FleurFairGallerySettleInfo.*;
import org.sorapointa.proto.FleurFairGallerySettleInfo;

public class FleurFairStageSettleNotify {
    @Tag(tag=10) public Integer stageType = null;
    @Tag(tag=13) public FleurFairGallerySettleInfo gallerySettleInfo = null;
    @Tag(tag=14) public FleurFairBossSettleInfo bossSettleInfo = null;
}
