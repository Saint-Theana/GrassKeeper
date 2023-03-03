package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ArenaChallengeMonsterLevel.*;
import org.sorapointa.proto.ArenaChallengeMonsterLevel;

public class ArenaChallengeActivityDetailInfo {
    public static class MapLevelOpenTimeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14) public Boolean isFinishAnyLevel = null;
    @Tag(tag=3) public List<MapLevelOpenTimeMap> levelOpenTimeMap = new ArrayList<>();
    @Tag(tag=15) public Integer worldLevel = null;
    @Tag(tag=9) public List<ArenaChallengeMonsterLevel> levelList = new ArrayList<>();
}
