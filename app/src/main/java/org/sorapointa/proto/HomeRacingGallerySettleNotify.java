package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RacingGallerySettleInfo.*;
import org.sorapointa.proto.RacingGallerySettleInfo;

public class HomeRacingGallerySettleNotify {
    @Tag(tag=11) public Integer galleryId = null;
    @Tag(tag=12) public RacingGallerySettleInfo settleInfo = null;
    @Tag(tag=7) public Integer rank = null;
    @Tag(tag=2) public Boolean isNewRecord = null;
}
