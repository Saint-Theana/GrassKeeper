package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class SummerTimeV2BoatGallerySettleInfo {
    @Tag(tag=15) public Integer param2 = null;
    @Tag(tag=5) public Integer galleryId = null;
    @Tag(tag=8) public Integer param3 = null;
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=4) public Integer usedTime = null;
    @Tag(tag=6) public Integer param1 = null;
}
