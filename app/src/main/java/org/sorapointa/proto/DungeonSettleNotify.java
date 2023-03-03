package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ChannelerSlabLoopDungeonResultInfo.*;
import org.sorapointa.proto.ChannelerSlabLoopDungeonResultInfo;
import org.sorapointa.proto.CrystalLinkDungeonSettleInfo.*;
import org.sorapointa.proto.CrystalLinkDungeonSettleInfo;
import org.sorapointa.proto.DungeonSettleExhibitionInfo.*;
import org.sorapointa.proto.DungeonSettleExhibitionInfo;
import org.sorapointa.proto.EffigyChallengeDungeonResultInfo.*;
import org.sorapointa.proto.EffigyChallengeDungeonResultInfo;
import org.sorapointa.proto.EffigyChallengeV2SettleInfo.*;
import org.sorapointa.proto.EffigyChallengeV2SettleInfo;
import org.sorapointa.proto.InstableSprayDungeonSettleInfo.*;
import org.sorapointa.proto.InstableSprayDungeonSettleInfo;
import org.sorapointa.proto.ParamList.*;
import org.sorapointa.proto.ParamList;
import org.sorapointa.proto.RoguelikeDungeonSettleInfo.*;
import org.sorapointa.proto.RoguelikeDungeonSettleInfo;
import org.sorapointa.proto.StrengthenPointData.*;
import org.sorapointa.proto.StrengthenPointData;
import org.sorapointa.proto.SummerTimeV2DungeonSettleInfo.*;
import org.sorapointa.proto.SummerTimeV2DungeonSettleInfo;
import org.sorapointa.proto.TowerLevelEndNotify.*;
import org.sorapointa.proto.TowerLevelEndNotify;
import org.sorapointa.proto.TrialAvatarFirstPassDungeonNotify.*;
import org.sorapointa.proto.TrialAvatarFirstPassDungeonNotify;
import org.sorapointa.proto.WindFieldDungeonSettleInfo.*;
import org.sorapointa.proto.WindFieldDungeonSettleInfo;

public class DungeonSettleNotify {
    public static class MapStrengthenPointDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public StrengthenPointData value = null;
    }

    public static class MapSettleShow {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ParamList value = null;
    }

    @Tag(tag=10) public Integer result = null;
    @Tag(tag=13) public Integer dungeonId = null;
    @Tag(tag=14) public List<MapStrengthenPointDataMap> strengthenPointDataMap = new ArrayList<>();
    @Tag(tag=8) public List<DungeonSettleExhibitionInfo> exhibitionInfoList = new ArrayList<>();
    @Tag(tag=12) public Integer createPlayerUid = null;
    @Tag(tag=11) public List<Integer> failCondList = new ArrayList<>();
    @Tag(tag=1) public Integer useTime = null;
    @Tag(tag=4) public Integer closeTime = null;
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=5) public List<MapSettleShow> settleShow = new ArrayList<>();
    @Tag(tag=351) public TowerLevelEndNotify towerLevelEndNotify = null;
    @Tag(tag=635) public TrialAvatarFirstPassDungeonNotify trialAvatarFirstPassDungeonNotify = null;
    @Tag(tag=686) public ChannelerSlabLoopDungeonResultInfo channelerSlabLoopDungeonResultInfo = null;
    @Tag(tag=328) public EffigyChallengeDungeonResultInfo effigyChallengeDungeonResultInfo = null;
    @Tag(tag=1482) public RoguelikeDungeonSettleInfo roguelikeDungeonSettleInfo = null;
    @Tag(tag=112) public CrystalLinkDungeonSettleInfo crystalLinkSettleInfo = null;
    @Tag(tag=1882) public SummerTimeV2DungeonSettleInfo summerTimeV2DungeonSettleInfo = null;
    @Tag(tag=193) public InstableSprayDungeonSettleInfo instableSpraySettleInfo = null;
    @Tag(tag=1825) public WindFieldDungeonSettleInfo windFieldDungeonSettleInfo = null;
    @Tag(tag=1802) public EffigyChallengeV2SettleInfo effigyChallengeV2SettleInfo = null;
}
