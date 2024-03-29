package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SamLampInfo.*;
import org.sorapointa.proto.SamLampInfo;
import org.sorapointa.proto.CrucibleInfo.*;
import org.sorapointa.proto.CrucibleInfo;
import org.sorapointa.proto.SalesmanInfo.*;
import org.sorapointa.proto.SalesmanInfo;
import org.sorapointa.proto.TrialAvatarInfo.*;
import org.sorapointa.proto.TrialAvatarInfo;
import org.sorapointa.proto.DeliveryInfo.*;
import org.sorapointa.proto.DeliveryInfo;
import org.sorapointa.proto.AsterInfo.*;
import org.sorapointa.proto.AsterInfo;
import org.sorapointa.proto.FlightInfo.*;
import org.sorapointa.proto.FlightInfo;
import org.sorapointa.proto.DragonSpineInfo.*;
import org.sorapointa.proto.DragonSpineInfo;
import org.sorapointa.proto.EffigyInfo.*;
import org.sorapointa.proto.EffigyInfo;
import org.sorapointa.proto.TreasureMapInfo.*;
import org.sorapointa.proto.TreasureMapInfo;
import org.sorapointa.proto.BlessingInfo.*;
import org.sorapointa.proto.BlessingInfo;
import org.sorapointa.proto.SeaLampInfo.*;
import org.sorapointa.proto.SeaLampInfo;
import org.sorapointa.proto.ExpeditionInfo.*;
import org.sorapointa.proto.ExpeditionInfo;
import org.sorapointa.proto.ArenaChallengeInfo.*;
import org.sorapointa.proto.ArenaChallengeInfo;
import org.sorapointa.proto.FleurFairInfo.*;
import org.sorapointa.proto.FleurFairInfo;
import org.sorapointa.proto.WaterSpiritInfo.*;
import org.sorapointa.proto.WaterSpiritInfo;
import org.sorapointa.proto.ChallnelerSlabInfo.*;
import org.sorapointa.proto.ChallnelerSlabInfo;
import org.sorapointa.proto.MistTrialActivityInfo.*;
import org.sorapointa.proto.MistTrialActivityInfo;
import org.sorapointa.proto.HideAndSeekInfo.*;
import org.sorapointa.proto.HideAndSeekInfo;
import org.sorapointa.proto.FindHilichurlInfo.*;
import org.sorapointa.proto.FindHilichurlInfo;
import org.sorapointa.proto.SummerTimeInfo.*;
import org.sorapointa.proto.SummerTimeInfo;
import org.sorapointa.proto.BuoyantCombatInfo.*;
import org.sorapointa.proto.BuoyantCombatInfo;
import org.sorapointa.proto.EchoShellInfo.*;
import org.sorapointa.proto.EchoShellInfo;
import org.sorapointa.proto.BounceConjuringInfo.*;
import org.sorapointa.proto.BounceConjuringInfo;
import org.sorapointa.proto.BlitzRushInfo.*;
import org.sorapointa.proto.BlitzRushInfo;
import org.sorapointa.proto.ChessInfo.*;
import org.sorapointa.proto.ChessInfo;
import org.sorapointa.proto.SumoInfo.*;
import org.sorapointa.proto.SumoInfo;
import org.sorapointa.proto.MoonfinTrialInfo.*;
import org.sorapointa.proto.MoonfinTrialInfo;
import org.sorapointa.proto.LunaRiteInfo.*;
import org.sorapointa.proto.LunaRiteInfo;
import org.sorapointa.proto.PlantFlowerInfo.*;
import org.sorapointa.proto.PlantFlowerInfo;
import org.sorapointa.proto.MusicGameInfo.*;
import org.sorapointa.proto.MusicGameInfo;
import org.sorapointa.proto.RoguelikeDungoenInfo.*;
import org.sorapointa.proto.RoguelikeDungoenInfo;
import org.sorapointa.proto.DigInfo.*;
import org.sorapointa.proto.DigInfo;
import org.sorapointa.proto.HachiInfo.*;
import org.sorapointa.proto.HachiInfo;
import org.sorapointa.proto.WinterCampInfo.*;
import org.sorapointa.proto.WinterCampInfo;
import org.sorapointa.proto.PotionInfo.*;
import org.sorapointa.proto.PotionInfo;
import org.sorapointa.proto.TanukiTravelActivityInfo.*;
import org.sorapointa.proto.TanukiTravelActivityInfo;
import org.sorapointa.proto.LanternRiteActivityInfo.*;
import org.sorapointa.proto.LanternRiteActivityInfo;
import org.sorapointa.proto.MichiaeMatsuriInfo.*;
import org.sorapointa.proto.MichiaeMatsuriInfo;
import org.sorapointa.proto.BartenderInfo.*;
import org.sorapointa.proto.BartenderInfo;
import org.sorapointa.proto.UgcInfo.*;
import org.sorapointa.proto.UgcInfo;
import org.sorapointa.proto.CrystalLinkInfo.*;
import org.sorapointa.proto.CrystalLinkInfo;
import org.sorapointa.proto.IrodoriInfo.*;
import org.sorapointa.proto.IrodoriInfo;
import org.sorapointa.proto.PhotoInfo.*;
import org.sorapointa.proto.PhotoInfo;
import org.sorapointa.proto.SpiceInfo.*;
import org.sorapointa.proto.SpiceInfo;
import org.sorapointa.proto.GachaInfo.*;
import org.sorapointa.proto.GachaInfo;
import org.sorapointa.proto.LuminanceStoneChallengeInfo.*;
import org.sorapointa.proto.LuminanceStoneChallengeInfo;
import org.sorapointa.proto.RogueDiaryInfo.*;
import org.sorapointa.proto.RogueDiaryInfo;
import org.sorapointa.proto.SummerTimeV2Info.*;
import org.sorapointa.proto.SummerTimeV2Info;
import org.sorapointa.proto.IslandPartyInfo.*;
import org.sorapointa.proto.IslandPartyInfo;
import org.sorapointa.proto.GearInfo.*;
import org.sorapointa.proto.GearInfo;
import org.sorapointa.proto.GravenInnocenceInfo.*;
import org.sorapointa.proto.GravenInnocenceInfo;
import org.sorapointa.proto.InstableSprayInfo.*;
import org.sorapointa.proto.InstableSprayInfo;
import org.sorapointa.proto.MuqadasPotionInfo.*;
import org.sorapointa.proto.MuqadasPotionInfo;
import org.sorapointa.proto.TreasureSeelieInfo.*;
import org.sorapointa.proto.TreasureSeelieInfo;
import org.sorapointa.proto.RockBoardExploreInfo.*;
import org.sorapointa.proto.RockBoardExploreInfo;
import org.sorapointa.proto.VintageInfo.*;
import org.sorapointa.proto.VintageInfo;
import org.sorapointa.proto.WindFieldInfo.*;
import org.sorapointa.proto.WindFieldInfo;
import org.sorapointa.proto.FungusFighterInfo.*;
import org.sorapointa.proto.FungusFighterInfo;
import org.sorapointa.proto.CharAmusementInfo.*;
import org.sorapointa.proto.CharAmusementInfo;
import org.sorapointa.proto.EffigyChallengeInfo.*;
import org.sorapointa.proto.EffigyChallengeInfo;
import org.sorapointa.proto.CoinCollectInfo.*;
import org.sorapointa.proto.CoinCollectInfo;
import org.sorapointa.proto.BrickBreakerInfo.*;
import org.sorapointa.proto.BrickBreakerInfo;
import org.sorapointa.proto.DuelHeartInfo.*;
import org.sorapointa.proto.DuelHeartInfo;
import org.sorapointa.proto.SeaLampV3Info.*;
import org.sorapointa.proto.SeaLampV3Info;
import org.sorapointa.proto.TeamChainInfo.*;
import org.sorapointa.proto.TeamChainInfo;
import org.sorapointa.proto.ElectroherculesBattleInfo.*;
import org.sorapointa.proto.ElectroherculesBattleInfo;
import org.sorapointa.proto.GcgFestivalInfo.*;
import org.sorapointa.proto.GcgFestivalInfo;
import org.sorapointa.proto.ActivityPushTipsData.*;
import org.sorapointa.proto.ActivityPushTipsData;
import org.sorapointa.proto.ActivityWatcherInfo.*;
import org.sorapointa.proto.ActivityWatcherInfo;

public class ActivityInfo {
    public static class MapActivityCoinMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapWishGiftNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=406) public List<MapActivityCoinMap> activityCoinMap = new ArrayList<>();
    @Tag(tag=1497) public Integer scoreLimit = null;
    @Tag(tag=644) public List<Integer> takenRewardList = new ArrayList<>();
    @Tag(tag=7) public Boolean isPlayOpenAnim = null;
    @Tag(tag=754) public Boolean isCommonContentClosed = null;
    @Tag(tag=12) public Integer endTime = null;
    @Tag(tag=10) public Integer activityType = null;
    @Tag(tag=519) public Integer selectedAvatarRewardId = null;
    @Tag(tag=2) public List<Integer> meetCondList = new ArrayList<>();
    @Tag(tag=15) public Integer activityId = null;
    @Tag(tag=537) public Boolean isBannerCleared = null;
    @Tag(tag=3) public Boolean isFinished = null;
    @Tag(tag=336) public List<ActivityPushTipsData> activityPushTipsDataList = new ArrayList<>();
    @Tag(tag=14) public List<ActivityWatcherInfo> watcherInfoList = new ArrayList<>();
    @Tag(tag=1126) public Boolean isHidden = null;
    @Tag(tag=6) public Integer scheduleId = null;
    @Tag(tag=9) public List<Integer> expireCondList = new ArrayList<>();
    @Tag(tag=2021) public List<Integer> fdjefldhela = new ArrayList<>();
    @Tag(tag=11) public Boolean isStarting = null;
    @Tag(tag=598) public Integer firstDayStartTime = null;
    @Tag(tag=396) public Integer curScore = null;
    @Tag(tag=1052) public List<MapWishGiftNumMap> wishGiftNumMap = new ArrayList<>();
    @Tag(tag=1637) public Boolean isQuickOpen = null;
    @Tag(tag=5) public Integer beginTime = null;
    @Tag(tag=4) public SamLampInfo samLampInfo = null;
    @Tag(tag=13) public CrucibleInfo crucibleInfo = null;
    @Tag(tag=1) public SalesmanInfo salesmanInfo = null;
    @Tag(tag=8) public TrialAvatarInfo trialAvatarInfo = null;
    @Tag(tag=32) public DeliveryInfo deliveryInfo = null;
    @Tag(tag=1808) public AsterInfo asterInfo = null;
    @Tag(tag=1062) public FlightInfo flightInfo = null;
    @Tag(tag=378) public DragonSpineInfo dragonSpineInfo = null;
    @Tag(tag=1991) public EffigyInfo effigyInfo = null;
    @Tag(tag=546) public TreasureMapInfo treasureMapInfo = null;
    @Tag(tag=1198) public BlessingInfo blessingInfo = null;
    @Tag(tag=578) public SeaLampInfo seaLampInfo = null;
    @Tag(tag=930) public ExpeditionInfo expeditionInfo = null;
    @Tag(tag=699) public ArenaChallengeInfo arenaChallengeInfo = null;
    @Tag(tag=1116) public FleurFairInfo fleurFairInfo = null;
    @Tag(tag=1651) public WaterSpiritInfo waterSpiritInfo = null;
    @Tag(tag=1135) public ChallnelerSlabInfo challnelerSlabInfo = null;
    @Tag(tag=1320) public MistTrialActivityInfo mistTrialActivityInfo = null;
    @Tag(tag=1077) public HideAndSeekInfo hideAndSeekInfo = null;
    @Tag(tag=417) public FindHilichurlInfo findHilichurlInfo = null;
    @Tag(tag=1477) public SummerTimeInfo summerTimeInfo = null;
    @Tag(tag=1277) public BuoyantCombatInfo buoyantCombatInfo = null;
    @Tag(tag=1172) public EchoShellInfo echoShellInfo = null;
    @Tag(tag=278) public BounceConjuringInfo bounceConjuringInfo = null;
    @Tag(tag=192) public BlitzRushInfo blitzRushInfo = null;
    @Tag(tag=1797) public ChessInfo chessInfo = null;
    @Tag(tag=1379) public SumoInfo sumoInfo = null;
    @Tag(tag=1122) public MoonfinTrialInfo moonfinTrialInfo = null;
    @Tag(tag=82) public LunaRiteInfo lunaRiteInfo = null;
    @Tag(tag=1864) public PlantFlowerInfo plantFlowerInfo = null;
    @Tag(tag=1220) public MusicGameInfo musicGameInfo = null;
    @Tag(tag=1817) public RoguelikeDungoenInfo roguelikeDungoenInfo = null;
    @Tag(tag=168) public DigInfo digInfo = null;
    @Tag(tag=1663) public HachiInfo hachiInfo = null;
    @Tag(tag=114) public WinterCampInfo winterCampInfo = null;
    @Tag(tag=1552) public PotionInfo potionInfo = null;
    @Tag(tag=1453) public TanukiTravelActivityInfo tanukiTravelActivityInfo = null;
    @Tag(tag=1372) public LanternRiteActivityInfo lanternRiteActivityInfo = null;
    @Tag(tag=428) public MichiaeMatsuriInfo michiaeMatsuriInfo = null;
    @Tag(tag=35) public BartenderInfo bartenderInfo = null;
    @Tag(tag=589) public UgcInfo ugcInfo = null;
    @Tag(tag=1375) public CrystalLinkInfo crystalLinkInfo = null;
    @Tag(tag=1014) public IrodoriInfo irodoriInfo = null;
    @Tag(tag=309) public PhotoInfo photoInfo = null;
    @Tag(tag=1446) public SpiceInfo spiceInfo = null;
    @Tag(tag=1177) public GachaInfo gachaInfo = null;
    @Tag(tag=142) public LuminanceStoneChallengeInfo luminanceStoneChallengeInfo = null;
    @Tag(tag=397) public RogueDiaryInfo rogueDiaryInfo = null;
    @Tag(tag=951) public SummerTimeV2Info summerTimeV2info = null;
    @Tag(tag=1631) public IslandPartyInfo islandPartyInfo = null;
    @Tag(tag=1801) public GearInfo gearInfo = null;
    @Tag(tag=1173) public GravenInnocenceInfo gravenInnocenceInfo = null;
    @Tag(tag=944) public InstableSprayInfo instableSprayInfo = null;
    @Tag(tag=1350) public MuqadasPotionInfo muqadasPotionInfo = null;
    @Tag(tag=1142) public TreasureSeelieInfo treasureSeelieInfo = null;
    @Tag(tag=1273) public RockBoardExploreInfo rockBoardExploreInfo = null;
    @Tag(tag=1316) public VintageInfo vintageInfo = null;
    @Tag(tag=2029) public WindFieldInfo windFieldInfo = null;
    @Tag(tag=1543) public FungusFighterInfo fungusFighterInfo = null;
    @Tag(tag=504) public CharAmusementInfo charAmusementInfo = null;
    @Tag(tag=1144) public EffigyChallengeInfo effigyChallengeInfo = null;
    @Tag(tag=559) public CoinCollectInfo coinCollectInfo = null;
    @Tag(tag=1275) public BrickBreakerInfo brickBreakerInfo = null;
    @Tag(tag=221) public DuelHeartInfo duelHeartInfo = null;
    @Tag(tag=1080) public SeaLampV3Info seaLampV3info = null;
    @Tag(tag=144) public TeamChainInfo teamChainInfo = null;
    @Tag(tag=172) public ElectroherculesBattleInfo electroherculesBattleInfo = null;
    @Tag(tag=71) public GcgFestivalInfo gcgFestivalInfo = null;
}
