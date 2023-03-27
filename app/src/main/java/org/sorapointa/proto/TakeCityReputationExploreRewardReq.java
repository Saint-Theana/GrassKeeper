package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeCityReputationExploreRewardReq {
    public enum TakeCityReputationExploreRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2816) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public List<Integer> exploreIdList = new ArrayList<>();
    @Tag(tag=1) public Integer cityId = null;
}
