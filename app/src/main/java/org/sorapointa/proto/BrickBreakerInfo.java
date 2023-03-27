package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerInfo {
    public static class MapSkillInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public List<BrickBreakerLevelInfo> dungeonLevelInfoList = new ArrayList<>();
    @Tag(tag=9) public List<BrickBreakerActivityStageInfo> stageInfoList = new ArrayList<>();
    @Tag(tag=3) public List<BrickBreakerLevelInfo> worldLevelInfoList = new ArrayList<>();
    @Tag(tag=8) public List<MapSkillInfoMap> skillInfoMap = new ArrayList<>();
}
