package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TreasureMapBonusChallengeInfo.*;
import org.sorapointa.proto.TreasureMapBonusChallengeInfo;
import org.sorapointa.proto.TreasureMapRegionInfo.*;
import org.sorapointa.proto.TreasureMapRegionInfo;

public class TreasureMapActivityDetailInfo {
    @Tag(tag=1) public Integer activeRegionIndex = null;
    @Tag(tag=6) public List<TreasureMapRegionInfo> regionInfoList = new ArrayList<>();
    @Tag(tag=7) public Boolean isMpChallengeTouched = null;
    @Tag(tag=10) public Integer treasureCloseTime = null;
    @Tag(tag=5) public List<TreasureMapBonusChallengeInfo> bonusChallengeList = new ArrayList<>();
    @Tag(tag=2) public Integer currencyNum = null;
    @Tag(tag=14) public Integer previewRewardId = null;
    @Tag(tag=8) public Integer minOpenPlayerLevel = null;
    @Tag(tag=13) public Integer totalMpSpotNum = null;
}
