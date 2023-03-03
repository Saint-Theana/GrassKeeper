package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RogueCellInfo.*;
import org.sorapointa.proto.RogueCellInfo;
import org.sorapointa.proto.RoguelikeRuneRecord.*;
import org.sorapointa.proto.RoguelikeRuneRecord;

public class EnterRoguelikeDungeonNotify {
    public static class MapCellInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public RogueCellInfo value = null;
    }

    @Tag(tag=14) public Boolean isMistClear = null;
    @Tag(tag=2) public Integer dungeonWeightConfigId = null;
    @Tag(tag=6) public List<RoguelikeRuneRecord> runeRecordList = new ArrayList<>();
    @Tag(tag=9) public List<Long> onstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=205) public Boolean isFirstEnter = null;
    @Tag(tag=3) public List<Integer> exploredCellList = new ArrayList<>();
    @Tag(tag=11) public List<MapCellInfoMap> cellInfoMap = new ArrayList<>();
    @Tag(tag=1) public Integer dungeonId = null;
    @Tag(tag=1999) public Integer refreshCostItemCount = null;
    @Tag(tag=13,isFloat=true) public Float bonusResourceProp = null;
    @Tag(tag=1541) public Integer reviseMonsterLevel = null;
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=10) public List<Long> backstageAvatarGuidList = new ArrayList<>();
    @Tag(tag=12) public Integer curCellId = null;
    @Tag(tag=7) public Integer refreshCostItemId = null;
    @Tag(tag=8) public Integer curLevel = null;
}
