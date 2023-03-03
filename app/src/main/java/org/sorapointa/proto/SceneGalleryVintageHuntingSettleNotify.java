package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageHuntingFirstStageSettleInfo.*;
import org.sorapointa.proto.VintageHuntingFirstStageSettleInfo;
import org.sorapointa.proto.VintageHuntingSecondStageSettleInfo.*;
import org.sorapointa.proto.VintageHuntingSecondStageSettleInfo;
import org.sorapointa.proto.VintageHuntingThirdStageSettleInfo.*;
import org.sorapointa.proto.VintageHuntingThirdStageSettleInfo;

public class SceneGalleryVintageHuntingSettleNotify {
    @Tag(tag=11) public Boolean hasNewWatcher = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=12) public Integer totalWatcherNum = null;
    @Tag(tag=6) public Integer finishedWatcherNum = null;
    @Tag(tag=1) public Boolean isNewRecord = null;
    @Tag(tag=4) public VintageHuntingFirstStageSettleInfo firstStageInfo = null;
    @Tag(tag=10) public VintageHuntingSecondStageSettleInfo secondStageInfo = null;
    @Tag(tag=8) public VintageHuntingThirdStageSettleInfo thirdStageInfo = null;
}
