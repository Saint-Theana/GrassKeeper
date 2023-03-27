package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LuminanceStoneChallengeActivityDetailInfo {
    @Tag(tag=10) public Integer bestScore = null;
    @Tag(tag=12) public Boolean isFinalGalleryComplete = null;
    @Tag(tag=4) public Boolean isContentClosed = null;
    @Tag(tag=11) public Integer currentStageId = null;
}
