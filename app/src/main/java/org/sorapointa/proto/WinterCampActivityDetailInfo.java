package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;
import org.sorapointa.proto.WinterCampRaceStageInfo.*;
import org.sorapointa.proto.WinterCampRaceStageInfo;
import org.sorapointa.proto.WinterCampStageInfo.*;
import org.sorapointa.proto.WinterCampStageInfo;

public class WinterCampActivityDetailInfo {
    @Tag(tag=9) public List<WinterCampRaceStageInfo> raceInfoList = new ArrayList<>();
    @Tag(tag=10) public WinterCampStageInfo battleInfo = null;
    @Tag(tag=8) public List<Integer> wishIdList = new ArrayList<>();
    @Tag(tag=14) public List<Integer> battleTakenRewardList = new ArrayList<>();
    @Tag(tag=6) public List<Integer> exploreTakenRewardList = new ArrayList<>();
    @Tag(tag=15) public Boolean isContentClosed = null;
    @Tag(tag=11) public WinterCampStageInfo exploreInfo = null;
    @Tag(tag=2) public List<ItemParam> usedItemList = new ArrayList<>();
}
