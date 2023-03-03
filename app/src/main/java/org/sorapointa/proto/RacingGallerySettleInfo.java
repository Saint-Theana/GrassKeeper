package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class RacingGallerySettleInfo {
    @Tag(tag=6) public Integer winnerUid = null;
    @Tag(tag=4) public Integer reason = null;
    @Tag(tag=1) public Integer useTime = null;
}
