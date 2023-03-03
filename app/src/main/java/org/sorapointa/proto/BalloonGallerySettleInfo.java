package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class BalloonGallerySettleInfo {
    @Tag(tag=8) public Integer score = null;
    @Tag(tag=14) public Integer reason = null;
    @Tag(tag=10) public Integer hitCount = null;
    @Tag(tag=6) public Integer ownerUid = null;
}
