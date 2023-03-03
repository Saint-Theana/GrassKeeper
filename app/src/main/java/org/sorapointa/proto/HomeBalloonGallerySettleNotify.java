package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BalloonGallerySettleInfo.*;
import org.sorapointa.proto.BalloonGallerySettleInfo;

public class HomeBalloonGallerySettleNotify {
    @Tag(tag=1) public Integer galleryId = null;
    @Tag(tag=5) public BalloonGallerySettleInfo settleInfo = null;
    @Tag(tag=6) public Integer rank = null;
    @Tag(tag=4) public Boolean isNewRecord = null;
}
