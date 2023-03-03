package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SummerTimeV2BoatGallerySettleInfo.*;
import org.sorapointa.proto.SummerTimeV2BoatGallerySettleInfo;

public class SummerTimeV2BoatSettleNotify {
    @Tag(tag=11) public SummerTimeV2BoatGallerySettleInfo settleInfo = null;
    @Tag(tag=7) public Integer stageId = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
    @Tag(tag=1) public Integer galleryId = null;
}
