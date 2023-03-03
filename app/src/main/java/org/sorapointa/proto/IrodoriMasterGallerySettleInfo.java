package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class IrodoriMasterGallerySettleInfo {
    @Tag(tag=15) public Integer reason = null;
    @Tag(tag=11) public Boolean isFinish = null;
    @Tag(tag=14) public Integer finishTime = null;
    @Tag(tag=6) public Integer difficult = null;
    @Tag(tag=4) public Integer levelId = null;
}
