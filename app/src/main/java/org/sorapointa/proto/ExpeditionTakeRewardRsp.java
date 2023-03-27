package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExpeditionTakeRewardRsp {
    public enum ExpeditionTakeRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2065) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer pathId = null;
    @Tag(tag=7) public Integer rewardLevel = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Boolean isBonus = null;
}
