package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonDataNotify {
    public static class MapDungeonDataMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum DungeonDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=906) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<MapDungeonDataMap> dungeonDataMap = new ArrayList<>();
}
