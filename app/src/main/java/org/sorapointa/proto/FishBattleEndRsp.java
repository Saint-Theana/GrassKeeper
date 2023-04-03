package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FishBattleResult.*;
import org.sorapointa.proto.FishBattleResult;
import org.sorapointa.proto.FishBattleEndRsp_FishNoRewardReason.*;
import org.sorapointa.proto.FishBattleEndRsp_FishNoRewardReason;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class FishBattleEndRsp {
    public enum FishBattleEndRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5814) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public List<ItemParam> rewardItemList = new ArrayList<>();
    @Tag(tag=12) public List<ItemParam> dropItemList = new ArrayList<>();
    @Tag(tag=10) public Integer battleResult = null;
    @Tag(tag=5) public Integer noRewardReason = null;
    @Tag(tag=8) public Boolean isGotReward = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public List<ItemParam> talentItemList = new ArrayList<>();
}
