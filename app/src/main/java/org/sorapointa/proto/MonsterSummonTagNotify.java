package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MonsterSummonTagNotify {
    public static class MapSummonTagMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum MonsterSummonTagNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1305) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public List<MapSummonTagMap> summonTagMap = new ArrayList<>();
    @Tag(tag=3) public Integer monsterEntityId = null;
}
