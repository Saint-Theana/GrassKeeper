package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonSettleNotify {
    public static class MapSettleShow {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ParamList value = null;
    }

    public static class MapStrengthenPointDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public StrengthenPointData value = null;
    }

    public enum DungeonSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=914) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public List<DungeonSettleExhibitionInfo> exhibitionInfoList = new ArrayList<>();
    @Tag(tag=14) public List<MapSettleShow> settleShow = new ArrayList<>();
    @Tag(tag=1) public List<MapStrengthenPointDataMap> strengthenPointDataMap = new ArrayList<>();
    @Tag(tag=15) public Integer result = null;
    @Tag(tag=2) public Integer useTime = null;
    @Tag(tag=7) public Integer dungeonId = null;
    @Tag(tag=8) public List<Integer> failCondList = new ArrayList<>();
    @Tag(tag=9) public Integer createPlayerUid = null;
    @Tag(tag=4) public Boolean isSuccess = null;
    @Tag(tag=6) public Integer closeTime = null;
    @Tag(tag=281) public TowerLevelEndNotify towerLevelEndNotify = null;
    @Tag(tag=1737) public TrialAvatarFirstPassDungeonNotify trialAvatarFirstPassDungeonNotify = null;
    @Tag(tag=1045) public ChannellerSlabLoopDungeonResultInfo channellerSlabLoopDungeonResultInfo = null;
    @Tag(tag=955) public EffigyChallengeDungeonResultInfo effigyChallengeDungeonResultInfo = null;
    @Tag(tag=799) public RoguelikeDungeonSettleInfo roguelikeDungeonSettleInfo = null;
    @Tag(tag=628) public CrystalLinkSettleInfo crystalLinkSettleInfo = null;
    @Tag(tag=96) public SummerTimeV2DungeonSettleInfo summerTimeV2dungeonSettleInfo = null;
    @Tag(tag=1797) public InstableSpraySettleInfo instableSpraySettleInfo = null;
    @Tag(tag=1009) public WindFieldDungeonSettleInfo windFieldDungeonSettleInfo = null;
    @Tag(tag=1839) public EffigyChallengeV2SettleInfo effigyChallengeV2settleInfo = null;
    @Tag(tag=1320) public TeamChainSettleInfo teamChainSettleInfo = null;
}
