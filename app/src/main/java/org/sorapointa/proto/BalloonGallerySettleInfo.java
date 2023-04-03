package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class BalloonGallerySettleInfo {
    @Tag(tag=5) public Integer ownerUid = null;
    @Tag(tag=3) public Integer hitCount = null;
    @Tag(tag=15) public Integer reason = null;
    @Tag(tag=6) public Integer score = null;
}
