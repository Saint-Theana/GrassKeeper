package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketFinishStorePlayRsp {
    public static class MapStoreIncomeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum MNGADGCMBJB {
        @Tag(tag=0) None ,
        @Tag(tag=23367) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer roundTotalIncome = null;
    @Tag(tag=14) public Integer roundCoinBIncome = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<Integer> triggerNpcEventList = new ArrayList<>();
    @Tag(tag=15) public Integer displayReturnCoinB = null;
    @Tag(tag=7) public Integer roundDeltaCoinC = null;
    @Tag(tag=1) public List<MapStoreIncomeMap> storeIncomeMap = new ArrayList<>();
    @Tag(tag=6) public Integer storeRound = null;
    @Tag(tag=5) public List<Integer> triggerEnvEventList = new ArrayList<>();
    @Tag(tag=9) public List<Integer> lowAttrStoreList = new ArrayList<>();
}
