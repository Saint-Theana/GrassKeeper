package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class FungusFighterTrainingSettleInfo {
    @Tag(tag=6) public Integer usedTime = null;
    @Tag(tag=5) public String transaction = null;
    @Tag(tag=13) public Integer reason = null;
}
