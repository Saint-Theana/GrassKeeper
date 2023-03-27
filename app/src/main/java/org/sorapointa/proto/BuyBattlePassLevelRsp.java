package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuyBattlePassLevelRsp {
    public enum BuyBattlePassLevelRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2615) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer buyLevel = null;
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
}
