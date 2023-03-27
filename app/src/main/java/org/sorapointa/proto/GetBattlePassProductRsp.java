package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetBattlePassProductRsp {
    public enum GetBattlePassProductRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2625) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public String priceTier = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer battlePassProductPlayType = null;
    @Tag(tag=6) public Integer curScheduleId = null;
    @Tag(tag=7) public String productId = null;
}
