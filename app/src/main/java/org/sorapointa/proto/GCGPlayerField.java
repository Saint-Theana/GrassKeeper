package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGZone.*;
import org.sorapointa.proto.GCGZone;
import org.sorapointa.proto.GCGDiceSideType.*;
import org.sorapointa.proto.GCGDiceSideType;
import org.sorapointa.proto.GCGPVEIntention.*;
import org.sorapointa.proto.GCGPVEIntention;
import org.sorapointa.proto.GCGWaitingCharacter.*;
import org.sorapointa.proto.GCGWaitingCharacter;

public class GCGPlayerField {
    public static class MapModifyZoneMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGZone value = null;
    }

    @Tag(tag=4) public GCGZone summonZone = null;
    @Tag(tag=12) public Integer diceCount = null;
    @Tag(tag=7) public List<Integer> diceSideList = new ArrayList<>();
    @Tag(tag=181) public Integer curWaitingIndex = null;
    @Tag(tag=1273) public List<GCGPVEIntention> intentionList = new ArrayList<>();
    @Tag(tag=14) public Integer cardBackShowId = null;
    @Tag(tag=1) public Integer fieldShowId = null;
    @Tag(tag=6) public Integer onStageCharacterGuid = null;
    @Tag(tag=3) public Integer controllerId = null;
    @Tag(tag=11) public List<MapModifyZoneMap> modifyZoneMap = new ArrayList<>();
    @Tag(tag=10) public GCGZone onStageZone = null;
    @Tag(tag=15) public Integer deckCardNum = null;
    @Tag(tag=5) public GCGZone assistZone = null;
    @Tag(tag=8) public GCGZone characterZone = null;
    @Tag(tag=9) public GCGZone handZone = null;
    @Tag(tag=2) public List<GCGWaitingCharacter> waitingList = new ArrayList<>();
    @Tag(tag=13) public Boolean isPassed = null;
}
