package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ArenaChallengeInfo {
    public static class MapLevelOpenTimeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=2) public List<MapLevelOpenTimeMap> levelOpenTimeMap = new ArrayList<>();
    @Tag(tag=6) public Integer worldLevel = null;
    @Tag(tag=7) public List<ArenaChallengeMonsterLevel> levelList = new ArrayList<>();
    @Tag(tag=5) public Boolean isFinishAnyLevel = null;
}
