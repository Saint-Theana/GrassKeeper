package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HideAndSeekStageType.*;
import org.sorapointa.proto.HideAndSeekStageType;
import org.sorapointa.proto.HideAndSeekPlayerBattleInfo.*;
import org.sorapointa.proto.HideAndSeekPlayerBattleInfo;

public class HideAndSeekStageInfo {
    public static class MapBattleInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public HideAndSeekPlayerBattleInfo value = null;
    }

    @Tag(tag=11) public Integer hunterUid = null;
    @Tag(tag=12) public List<MapBattleInfoMap> battleInfoMap = new ArrayList<>();
    @Tag(tag=15) public Boolean isRecordScore = null;
    @Tag(tag=9) public List<Integer> hiderUidList = new ArrayList<>();
    @Tag(tag=8) public Integer mapId = null;
    @Tag(tag=1) public Integer stageType = null;
}
