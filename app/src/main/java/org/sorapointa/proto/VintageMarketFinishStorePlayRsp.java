package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketFinishStorePlayRsp {
    public static class MapStoreIncomeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=8) public List<Integer> triggerEnvEventList = new ArrayList<>();
    @Tag(tag=12) public Integer storeRound = null;
    @Tag(tag=10) public List<Integer> triggerNpcEventList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> lowAttrStoreList = new ArrayList<>();
    @Tag(tag=9) public Integer roundCoinBIncome = null;
    @Tag(tag=1) public Integer roundDeltaCoinC = null;
    @Tag(tag=3) public List<MapStoreIncomeMap> storeIncomeMap = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer roundTotalIncome = null;
    @Tag(tag=15) public Integer displayReturnCoinB = null;
}
