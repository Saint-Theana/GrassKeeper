package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterRoguelikeDungeonNotify {
    public static class MapCellInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public RogueCellInfo value = null;
    }

    public enum EnterRoguelikeDungeonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8098) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<Long> onstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=14) public List<MapCellInfoMap> cellInfoMap = new ArrayList<>();
    @Tag(tag=2) public Integer dungeonId = null;
    @Tag(tag=15) public Integer dungeonWeightConfigId = null;
    @Tag(tag=917) public Integer refreshCostItemCount = null;
    @Tag(tag=3) public Integer curCellId = null;
    @Tag(tag=1,isFloat=true) public Float bonusResourceProp = null;
    @Tag(tag=1665) public Integer reviseMonsterLevel = null;
    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=5) public List<Integer> exploredCellList = new ArrayList<>();
    @Tag(tag=7) public List<Long> backstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=12) public Integer curLevel = null;
    @Tag(tag=6) public Boolean isMistClear = null;
    @Tag(tag=4) public List<RoguelikeRuneRecord> runeRecordList = new ArrayList<>();
    @Tag(tag=13) public Integer refreshCostItemId = null;
    @Tag(tag=379) public Boolean isFirstEnter = null;
}
