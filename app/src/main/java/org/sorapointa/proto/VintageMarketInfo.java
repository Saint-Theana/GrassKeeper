package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageMarketDealInfo.*;
import org.sorapointa.proto.VintageMarketDealInfo;
import org.sorapointa.proto.VintageMarketStoreInfo.*;
import org.sorapointa.proto.VintageMarketStoreInfo;

public class VintageMarketInfo {
    public static class MapBargainInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Boolean value = null;
    }

    @Tag(tag=1485) public Boolean isHelpModuleOpen = null;
    @Tag(tag=15) public Boolean isStoreContentInterrupt = null;
    @Tag(tag=11) public VintageMarketDealInfo dealInfo = null;
    @Tag(tag=7) public Integer storeRound = null;
    @Tag(tag=207) public List<Integer> storeRoundIncomeList = new ArrayList<>();
    @Tag(tag=5) public Boolean isStoreContentFinish = null;
    @Tag(tag=8) public List<Integer> curEnvEventList = new ArrayList<>();
    @Tag(tag=10) public Boolean isMarketContentOpen = null;
    @Tag(tag=1800) public Integer nextCanUseHelpRound = null;
    @Tag(tag=2) public Boolean isMarketContentFinish = null;
    @Tag(tag=14) public List<Integer> viewedStrategyList = new ArrayList<>();
    @Tag(tag=3) public Integer prevCoinCNum = null;
    @Tag(tag=6) public List<MapBargainInfoMap> bargainInfoMap = new ArrayList<>();
    @Tag(tag=1798) public Integer dividendRewardCount = null;
    @Tag(tag=4) public List<Integer> curNpcEventList = new ArrayList<>();
    @Tag(tag=366) public Boolean isHelpInCd = null;
    @Tag(tag=1) public Integer prevCoinBNum = null;
    @Tag(tag=9) public List<VintageMarketStoreInfo> openStoreList = new ArrayList<>();
    @Tag(tag=760) public Integer helpSkillId = null;
    @Tag(tag=12) public Boolean isRoundTipsView = null;
    @Tag(tag=876) public Boolean isStrategyModuleOpen = null;
    @Tag(tag=13) public List<Integer> unlockStrategyList = new ArrayList<>();
}
