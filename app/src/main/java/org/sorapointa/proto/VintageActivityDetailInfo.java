package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageBoothUsedItemData.*;
import org.sorapointa.proto.VintageBoothUsedItemData;
import org.sorapointa.proto.VintageCampChallengeStageData.*;
import org.sorapointa.proto.VintageCampChallengeStageData;
import org.sorapointa.proto.VintageHuntingStageData.*;
import org.sorapointa.proto.VintageHuntingStageData;
import org.sorapointa.proto.VintageMarketInfo.*;
import org.sorapointa.proto.VintageMarketInfo;
import org.sorapointa.proto.VintagePresentStageData.*;
import org.sorapointa.proto.VintagePresentStageData;

public class VintageActivityDetailInfo {
    public static class MapHuntingStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintageHuntingStageData value = null;
    }

    public static class MapCampStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintageCampChallengeStageData value = null;
    }

    public static class MapPresentStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintagePresentStageData value = null;
    }

    @Tag(tag=2) public VintageMarketInfo marketInfo = null;
    @Tag(tag=7) public List<MapHuntingStageMap> huntingStageMap = new ArrayList<>();
    @Tag(tag=5) public VintageBoothUsedItemData boothData = null;
    @Tag(tag=13) public List<MapCampStageMap> campStageMap = new ArrayList<>();
    @Tag(tag=4) public List<MapPresentStageMap> presentStageMap = new ArrayList<>();
    @Tag(tag=11) public Boolean isContentClosed = null;
}
