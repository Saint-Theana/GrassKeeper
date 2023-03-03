package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerDieType.*;
import org.sorapointa.proto.PlayerDieType;
import org.sorapointa.proto.StrengthenPointData.*;
import org.sorapointa.proto.StrengthenPointData;

public class DungeonPlayerDieNotify {
    public static class MapStrengthenPointDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public StrengthenPointData value = null;
    }

    @Tag(tag=15) public List<MapStrengthenPointDataMap> strengthenPointDataMap = new ArrayList<>();
    @Tag(tag=1) public Integer waitTime = null;
    @Tag(tag=9) public Integer dungeonId = null;
    @Tag(tag=13) public Integer murdererEntityId = null;
    @Tag(tag=3) public Integer dieType = null;
    @Tag(tag=6) public Integer reviveCount = null;
    @Tag(tag=4) public Integer monsterId = null;
    @Tag(tag=8) public Integer gadgetId = null;
}
