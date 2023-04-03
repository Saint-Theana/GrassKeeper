package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TreasureMapRegionInfo.*;
import org.sorapointa.proto.TreasureMapRegionInfo;
import org.sorapointa.proto.TreasureMapBonusChallengeInfo.*;
import org.sorapointa.proto.TreasureMapBonusChallengeInfo;

public class TreasureMapActivityDetailInfo {
    @Tag(tag=6) public Boolean isMpChallengeTouched = null;
    @Tag(tag=14) public Integer totalMpSpotNum = null;
    @Tag(tag=7) public List<TreasureMapRegionInfo> regionInfoList = new ArrayList<>();
    @Tag(tag=1) public Integer currencyNum = null;
    @Tag(tag=3) public Integer minOpenPlayerLevel = null;
    @Tag(tag=2) public Integer activeRegionIndex = null;
    @Tag(tag=15) public List<TreasureMapBonusChallengeInfo> bonusChallengeList = new ArrayList<>();
    @Tag(tag=12) public Integer previewRewardId = null;
    @Tag(tag=5) public Integer treasureCloseTime = null;
}
