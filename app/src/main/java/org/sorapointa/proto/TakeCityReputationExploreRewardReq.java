package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCityReputationExploreRewardReq {
    @Tag(tag=15) public Integer cityId = null;
    @Tag(tag=12) public List<Integer> exploreIdList = new ArrayList<>();
}
