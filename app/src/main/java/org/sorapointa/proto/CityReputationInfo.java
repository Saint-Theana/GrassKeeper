package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationInfo {
    @Tag(tag=11) public Integer totalAcceptRequestNum = null;
    @Tag(tag=9) public CityReputationHuntInfo huntInfo = null;
    @Tag(tag=8) public Integer exp = null;
    @Tag(tag=5) public CityReputationExploreInfo exploreInfo = null;
    @Tag(tag=13) public Integer level = null;
    @Tag(tag=4) public List<Integer> takenLevelRewardList = new ArrayList<>();
    @Tag(tag=7) public CityReputationQuestInfo questInfo = null;
    @Tag(tag=2) public CityReputationRequestInfo requestInfo = null;
    @Tag(tag=14) public Integer nextRefreshTime = null;
}
