package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MonsterSummonTagNotify {
    public static class MapSummonTagMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public List<MapSummonTagMap> summonTagMap = new ArrayList<>();
    @Tag(tag=8) public Integer monsterEntityId = null;
}
