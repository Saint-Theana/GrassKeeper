package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneWeaponInfo {
    public static class MapAffixMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=2) public Integer gadgetId = null;
    @Tag(tag=3) public Integer itemId = null;
    @Tag(tag=4) public Long guid = null;
    @Tag(tag=5) public Integer level = null;
    @Tag(tag=6) public Integer promoteLevel = null;
    @Tag(tag=7) public AbilitySyncStateInfo abilityInfo = null;
    @Tag(tag=8) public List<MapAffixMap> affixMap = new ArrayList<>();
    @Tag(tag=9) public EntityRendererChangedInfo rendererChangedInfo = null;
}
