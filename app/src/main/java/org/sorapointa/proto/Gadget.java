package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GadgetBornType.*;
import org.sorapointa.proto.GadgetBornType;
import org.sorapointa.proto.TrifleItem.*;
import org.sorapointa.proto.TrifleItem;
import org.sorapointa.proto.GatherGadget.*;
import org.sorapointa.proto.GatherGadget;
import org.sorapointa.proto.Worktop.*;
import org.sorapointa.proto.Worktop;
import org.sorapointa.proto.ClientGadget.*;
import org.sorapointa.proto.ClientGadget;
import org.sorapointa.proto.Weather.*;
import org.sorapointa.proto.Weather;
import org.sorapointa.proto.AbilityGadget.*;
import org.sorapointa.proto.AbilityGadget;
import org.sorapointa.proto.StatueGadget.*;
import org.sorapointa.proto.StatueGadget;
import org.sorapointa.proto.BossChest.*;
import org.sorapointa.proto.BossChest;
import org.sorapointa.proto.BlossomChest.*;
import org.sorapointa.proto.BlossomChest;
import org.sorapointa.proto.MpPlayReward.*;
import org.sorapointa.proto.MpPlayReward;
import org.sorapointa.proto.GeneralReward.*;
import org.sorapointa.proto.GeneralReward;
import org.sorapointa.proto.OfferingInfo.*;
import org.sorapointa.proto.OfferingInfo;
import org.sorapointa.proto.FoundationInfo.*;
import org.sorapointa.proto.FoundationInfo;
import org.sorapointa.proto.VehicleInfo.*;
import org.sorapointa.proto.VehicleInfo;
import org.sorapointa.proto.ShellInfo.*;
import org.sorapointa.proto.ShellInfo;
import org.sorapointa.proto.ScreenInfo.*;
import org.sorapointa.proto.ScreenInfo;
import org.sorapointa.proto.FishPoolInfo.*;
import org.sorapointa.proto.FishPoolInfo;
import org.sorapointa.proto.CustomGadgetTreeInfo.*;
import org.sorapointa.proto.CustomGadgetTreeInfo;
import org.sorapointa.proto.RoguelikeGadgetInfo.*;
import org.sorapointa.proto.RoguelikeGadgetInfo;
import org.sorapointa.proto.NightCrowGadgetInfo.*;
import org.sorapointa.proto.NightCrowGadgetInfo;
import org.sorapointa.proto.DeshretObeliskGadgetInfo.*;
import org.sorapointa.proto.DeshretObeliskGadgetInfo;
import org.sorapointa.proto.CoinCollectOperatorInfo.*;
import org.sorapointa.proto.CoinCollectOperatorInfo;
import org.sorapointa.proto.PlatformInfo.*;
import org.sorapointa.proto.PlatformInfo;
import org.sorapointa.proto.GadgetPlayInfo.*;
import org.sorapointa.proto.GadgetPlayInfo;

public class Gadget {
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
    @Tag(tag=12) public TrifleItem trifleItem = null;
    @Tag(tag=13) public GatherGadget gatherGadget = null;
    @Tag(tag=14) public Worktop worktop = null;
    @Tag(tag=15) public ClientGadget clientGadget = null;
    @Tag(tag=17) public Weather weather = null;
    @Tag(tag=18) public AbilityGadget abilityGadget = null;
    @Tag(tag=19) public StatueGadget statueGadget = null;
    @Tag(tag=20) public BossChest bossChest = null;
    @Tag(tag=41) public BlossomChest blossomChest = null;
    @Tag(tag=42) public MpPlayReward mpPlayReward = null;
    @Tag(tag=43) public GeneralReward generalReward = null;
    @Tag(tag=44) public OfferingInfo offeringInfo = null;
    @Tag(tag=45) public FoundationInfo foundationInfo = null;
    @Tag(tag=46) public VehicleInfo vehicleInfo = null;
    @Tag(tag=47) public ShellInfo shellInfo = null;
    @Tag(tag=48) public ScreenInfo screenInfo = null;
    @Tag(tag=59) public FishPoolInfo fishPoolInfo = null;
    @Tag(tag=60) public CustomGadgetTreeInfo customGadgetTreeInfo = null;
    @Tag(tag=61) public RoguelikeGadgetInfo roguelikeGadgetInfo = null;
    @Tag(tag=62) public NightCrowGadgetInfo nightCrowGadgetInfo = null;
    @Tag(tag=63) public DeshretObeliskGadgetInfo deshretObeliskGadgetInfo = null;
    @Tag(tag=64) public CoinCollectOperatorInfo coinCollectOperatorInfo = null;
    @Tag(tag=21) public Integer markFlag = null;
    @Tag(tag=22) public Integer propOwnerEntityId = null;
    @Tag(tag=23) public PlatformInfo platform = null;
    @Tag(tag=24) public List<Integer> interactUidList = new ArrayList<>();
    @Tag(tag=25) public Integer draftId = null;
    @Tag(tag=26) public Integer gadgetTalkState = null;
    @Tag(tag=100) public GadgetPlayInfo playInfo = null;
}
