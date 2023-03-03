package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityGadgetInfo.*;
import org.sorapointa.proto.AbilityGadgetInfo;
import org.sorapointa.proto.BlossomChestInfo.*;
import org.sorapointa.proto.BlossomChestInfo;
import org.sorapointa.proto.BossChestInfo.*;
import org.sorapointa.proto.BossChestInfo;
import org.sorapointa.proto.ClientGadgetInfo.*;
import org.sorapointa.proto.ClientGadgetInfo;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;
import org.sorapointa.proto.DeshretObeliskGadgetInfo.*;
import org.sorapointa.proto.DeshretObeliskGadgetInfo;
import org.sorapointa.proto.EchoShellInfo.*;
import org.sorapointa.proto.EchoShellInfo;
import org.sorapointa.proto.FishPoolInfo.*;
import org.sorapointa.proto.FishPoolInfo;
import org.sorapointa.proto.FoundationInfo.*;
import org.sorapointa.proto.FoundationInfo;
import org.sorapointa.proto.GadgetBornType.*;
import org.sorapointa.proto.GadgetBornType;
import org.sorapointa.proto.GadgetGeneralRewardInfo.*;
import org.sorapointa.proto.GadgetGeneralRewardInfo;
import org.sorapointa.proto.GadgetPlayInfo.*;
import org.sorapointa.proto.GadgetPlayInfo;
import org.sorapointa.proto.GatherGadgetInfo.*;
import org.sorapointa.proto.GatherGadgetInfo;
import org.sorapointa.proto.Item.*;
import org.sorapointa.proto.Item;
import org.sorapointa.proto.MpPlayRewardInfo.*;
import org.sorapointa.proto.MpPlayRewardInfo;
import org.sorapointa.proto.NightCrowGadgetInfo.*;
import org.sorapointa.proto.NightCrowGadgetInfo;
import org.sorapointa.proto.OfferingInfo.*;
import org.sorapointa.proto.OfferingInfo;
import org.sorapointa.proto.PlatformInfo.*;
import org.sorapointa.proto.PlatformInfo;
import org.sorapointa.proto.RoguelikeGadgetInfo.*;
import org.sorapointa.proto.RoguelikeGadgetInfo;
import org.sorapointa.proto.ScreenInfo.*;
import org.sorapointa.proto.ScreenInfo;
import org.sorapointa.proto.StatueGadgetInfo.*;
import org.sorapointa.proto.StatueGadgetInfo;
import org.sorapointa.proto.VehicleInfo.*;
import org.sorapointa.proto.VehicleInfo;
import org.sorapointa.proto.WeatherInfo.*;
import org.sorapointa.proto.WeatherInfo;
import org.sorapointa.proto.WorktopInfo.*;
import org.sorapointa.proto.WorktopInfo;

public class SceneGadgetInfo {
    @Tag(tag=1) public Integer gadgetId = null;
    @Tag(tag=2) public Integer groupId = null;
    @Tag(tag=3) public Integer configId = null;
    @Tag(tag=4) public Integer ownerEntityId = null;
    @Tag(tag=5) public Integer bornType = null;
    @Tag(tag=6) public Integer gadgetState = null;
    @Tag(tag=7) public Integer gadgetType = null;
    @Tag(tag=8) public Boolean isShowCutscene = null;
    @Tag(tag=9) public Integer authorityPeerId = null;
    @Tag(tag=10) public Boolean isEnableInteract = null;
    @Tag(tag=11) public Integer interactId = null;
    @Tag(tag=21) public Integer markFlag = null;
    @Tag(tag=22) public Integer propOwnerEntityId = null;
    @Tag(tag=23) public PlatformInfo platform = null;
    @Tag(tag=24) public List<Integer> interactUidList = new ArrayList<>();
    @Tag(tag=25) public Integer draftId = null;
    @Tag(tag=26) public Integer gadgetTalkState = null;
    @Tag(tag=100) public GadgetPlayInfo playInfo = null;
    @Tag(tag=12) public Item trifleItem = null;
    @Tag(tag=13) public GatherGadgetInfo gatherGadget = null;
    @Tag(tag=14) public WorktopInfo worktop = null;
    @Tag(tag=15) public ClientGadgetInfo clientGadget = null;
    @Tag(tag=17) public WeatherInfo weather = null;
    @Tag(tag=18) public AbilityGadgetInfo abilityGadget = null;
    @Tag(tag=19) public StatueGadgetInfo statueGadget = null;
    @Tag(tag=20) public BossChestInfo bossChest = null;
    @Tag(tag=41) public BlossomChestInfo blossomChest = null;
    @Tag(tag=42) public MpPlayRewardInfo mpPlayReward = null;
    @Tag(tag=43) public GadgetGeneralRewardInfo generalReward = null;
    @Tag(tag=44) public OfferingInfo offeringInfo = null;
    @Tag(tag=45) public FoundationInfo foundationInfo = null;
    @Tag(tag=46) public VehicleInfo vehicleInfo = null;
    @Tag(tag=47) public EchoShellInfo shellInfo = null;
    @Tag(tag=48) public ScreenInfo screenInfo = null;
    @Tag(tag=59) public FishPoolInfo fishPoolInfo = null;
    @Tag(tag=60) public CustomGadgetTreeInfo customGadgetTreeInfo = null;
    @Tag(tag=61) public RoguelikeGadgetInfo roguelikeGadgetInfo = null;
    @Tag(tag=62) public NightCrowGadgetInfo nightCrowGadgetInfo = null;
    @Tag(tag=63) public DeshretObeliskGadgetInfo deshretObeliskGadgetInfo = null;
}