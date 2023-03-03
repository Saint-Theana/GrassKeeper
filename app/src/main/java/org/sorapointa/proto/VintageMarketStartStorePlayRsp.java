package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStartStorePlayRsp {
    @Tag(tag=7) public Integer prevRoundCoinB = null;
    @Tag(tag=2) public Integer storeRound = null;
    @Tag(tag=5) public Integer prevRoundCoinC = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
