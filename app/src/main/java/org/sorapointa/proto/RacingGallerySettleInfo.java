package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class RacingGallerySettleInfo {
    @Tag(tag=9) public Integer useTime = null;
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=10) public Integer winnerUid = null;
}
