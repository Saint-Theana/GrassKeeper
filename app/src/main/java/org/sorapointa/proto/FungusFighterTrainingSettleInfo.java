package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class FungusFighterTrainingSettleInfo {
    @Tag(tag=15) public Integer usedTime = null;
    @Tag(tag=3) public Integer reason = null;
    @Tag(tag=1) public String transaction = null;
}
