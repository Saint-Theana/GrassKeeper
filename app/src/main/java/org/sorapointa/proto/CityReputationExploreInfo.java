package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CityReputationExploreInfo {
    @Tag(tag=9) public List<Integer> takenExploreRewardList = new ArrayList<>();
    @Tag(tag=1) public Boolean isOpen = null;
    @Tag(tag=11) public Integer explorePercent = null;
}
