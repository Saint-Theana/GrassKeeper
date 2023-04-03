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

    @Tag(tag=15) public List<Integer> unlockStrategyList = new ArrayList<>();
    @Tag(tag=2) public Integer storeRound = null;
    @Tag(tag=1216) public List<Integer> storeRoundIncomeList = new ArrayList<>();
    @Tag(tag=9) public List<MapBargainInfoMap> bargainInfoMap = new ArrayList<>();
    @Tag(tag=3) public List<Integer> curNpcEventList = new ArrayList<>();
    @Tag(tag=1) public List<Integer> curEnvEventList = new ArrayList<>();
    @Tag(tag=5) public Boolean isRoundTipsView = null;
    @Tag(tag=1164) public Boolean isStrategyModuleOpen = null;
    @Tag(tag=255) public Integer dividendRewardCount = null;
    @Tag(tag=12) public Integer prevCoinCNum = null;
    @Tag(tag=1035) public Boolean isHelpModuleOpen = null;
    @Tag(tag=4) public Boolean isMarketContentOpen = null;
    @Tag(tag=10) public Boolean isStoreContentInterrupt = null;
    @Tag(tag=14) public VintageMarketDealInfo dealInfo = null;
    @Tag(tag=6) public Boolean isMarketContentFinish = null;
    @Tag(tag=7) public List<VintageMarketStoreInfo> openStoreList = new ArrayList<>();
    @Tag(tag=13) public List<Integer> viewedStrategyList = new ArrayList<>();
    @Tag(tag=1222) public Integer helpSkillId = null;
    @Tag(tag=8) public Boolean isStoreContentFinish = null;
    @Tag(tag=11) public Integer prevCoinBNum = null;
    @Tag(tag=458) public Integer nextCanUseHelpRound = null;
    @Tag(tag=1190) public Boolean isHelpInCd = null;
}
