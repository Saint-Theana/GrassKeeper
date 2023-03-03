package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishBattleResult.*;
import org.sorapointa.proto.FishBattleResult;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class FishBattleEndRsp {
    public enum FishNoRewardReason {
        @Tag(tag=0) FISH_NO_REWARD_REASON_NONE ,
        @Tag(tag=1) FISH_NO_REWARD_REASON_ACTIVITY_LIMIT ,
        @Tag(tag=2) FISH_NO_REWARD_REASON_BAG_LIMIT ,
        @Tag(tag=3) FISH_NO_REWARD_REASON_POOL_LIMIT ;
    }

    @Tag(tag=10) public Boolean isGotReward = null;
    @Tag(tag=11) public List<ItemParam> rewardItemList = new ArrayList<>();
    @Tag(tag=13) public List<ItemParam> talentItemList = new ArrayList<>();
    @Tag(tag=9) public List<ItemParam> dropItemList = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public FishNoRewardReason noRewardReason = null;
    @Tag(tag=6) public Integer battleResult = null;
}
