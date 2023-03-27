package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CoopRewardUpdateNotify {
    public enum CoopRewardUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1975) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<CoopReward> rewardList = new ArrayList<>();
}
