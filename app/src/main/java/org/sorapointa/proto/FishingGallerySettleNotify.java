package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishingGallerySettleInfo.*;
import org.sorapointa.proto.FishingGallerySettleInfo;

public class FishingGallerySettleNotify {
    @Tag(tag=6) public Integer galleryId = null;
    @Tag(tag=15) public Integer levelId = null;
    @Tag(tag=13) public FishingGallerySettleInfo settleInfo = null;
}
