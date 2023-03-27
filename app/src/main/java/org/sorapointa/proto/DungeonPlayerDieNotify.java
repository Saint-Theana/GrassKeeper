package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonPlayerDieNotify {
    public static class MapStrengthenPointDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public StrengthenPointData value = null;
    }

    public enum DungeonPlayerDieNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=924) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer dieType = null;
    @Tag(tag=5) public Integer murdererEntityId = null;
    @Tag(tag=3) public Integer waitTime = null;
    @Tag(tag=12) public List<MapStrengthenPointDataMap> strengthenPointDataMap = new ArrayList<>();
    @Tag(tag=8) public Integer reviveCount = null;
    @Tag(tag=10) public Integer monsterId = null;
    @Tag(tag=7) public Integer gadgetId = null;
    @Tag(tag=6) public Integer dungeonId = null;
}
