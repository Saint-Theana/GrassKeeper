package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStartStorePlayRsp {
    public enum ENOKLJEALMK {
        @Tag(tag=0) None ,
        @Tag(tag=21141) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public Integer prevRoundCoinC = null;
    @Tag(tag=13) public Integer prevRoundCoinB = null;
    @Tag(tag=6) public Integer storeRound = null;
}
