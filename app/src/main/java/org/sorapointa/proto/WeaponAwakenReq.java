package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WeaponAwakenReq {
    public static class MapAffixLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=10) public Long itemGuid = null;
    @Tag(tag=7) public List<MapAffixLevelMap> affixLevelMap = new ArrayList<>();
    @Tag(tag=9) public Long targetWeaponGuid = null;
}
