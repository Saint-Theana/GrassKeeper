package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CityReputationExploreInfo.*;
import org.sorapointa.proto.CityReputationExploreInfo;
import org.sorapointa.proto.CityReputationHuntInfo.*;
import org.sorapointa.proto.CityReputationHuntInfo;
import org.sorapointa.proto.CityReputationQuestInfo.*;
import org.sorapointa.proto.CityReputationQuestInfo;
import org.sorapointa.proto.CityReputationRequestInfo.*;
import org.sorapointa.proto.CityReputationRequestInfo;

public class CityReputationInfo {
    @Tag(tag=4) public Integer level = null;
    @Tag(tag=3) public Integer nextRefreshTime = null;
    @Tag(tag=11) public CityReputationHuntInfo huntInfo = null;
    @Tag(tag=2) public List<Integer> takenLevelRewardList = new ArrayList<>();
    @Tag(tag=6) public Integer totalAcceptRequestNum = null;
    @Tag(tag=5) public CityReputationRequestInfo requestInfo = null;
    @Tag(tag=9) public CityReputationQuestInfo questInfo = null;
    @Tag(tag=13) public Integer exp = null;
    @Tag(tag=10) public CityReputationExploreInfo exploreInfo = null;
}
