package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CodexType.*;
import org.sorapointa.proto.CodexType;

public class CodexTypeData {
    public static class MapWeaponMaxPromoteLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=4) public List<Integer> codexIdList = new ArrayList<>();
    @Tag(tag=8) public List<Boolean> haveViewedList = new ArrayList<>();
    @Tag(tag=14) public Integer type = null;
    @Tag(tag=3) public List<MapWeaponMaxPromoteLevelMap> weaponMaxPromoteLevelMap = new ArrayList<>();
}
