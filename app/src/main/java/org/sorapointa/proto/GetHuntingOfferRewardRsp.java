package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetHuntingOfferRewardRsp {
    public enum GetHuntingOfferRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4343) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public HuntingPair huntingPair = null;
    @Tag(tag=6) public Integer cityId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
