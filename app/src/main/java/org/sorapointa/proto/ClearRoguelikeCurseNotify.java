package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClearRoguelikeCurseNotify {
    public static class MapClearCurseMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=10) public List<MapClearCurseMap> clearCurseMap = new ArrayList<>();
    @Tag(tag=11) public Boolean isClearAll = null;
    @Tag(tag=8) public Integer cardId = null;
    @Tag(tag=1) public Boolean isCurseAllClear = null;
}
