package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHuntingOfferRewardReq {
    public enum GetHuntingOfferRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4319) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public HuntingPair huntingPair = null;
    @Tag(tag=13) public Integer cityId = null;
}
