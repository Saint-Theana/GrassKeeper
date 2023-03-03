package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GalleryStopReason.*;
import org.sorapointa.proto.GalleryStopReason;

public class FungusFighterTrainingGallerySettleNotify {
    @Tag(tag=14) public Boolean isNewRecord = null;
    @Tag(tag=4) public Integer totalUsedTime = null;
    @Tag(tag=5) public Integer reason = null;
    @Tag(tag=1) public Integer deadFungusNum = null;
    @Tag(tag=15) public Integer settleRound = null;
    @Tag(tag=10) public Boolean isFinalSettle = null;
    @Tag(tag=11) public Integer gadgetLifePercentage = null;
    @Tag(tag=9) public Integer finalScore = null;
}
