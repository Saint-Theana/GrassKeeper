package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationExploreInfo {
    @Tag(tag=2) public List<Integer> takenExploreRewardList = new ArrayList<>();
    @Tag(tag=14) public Integer explorePercent = null;
    @Tag(tag=15) public Boolean isOpen = null;
}
