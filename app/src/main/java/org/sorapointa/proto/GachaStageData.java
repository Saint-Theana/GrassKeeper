package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GachaStageData {
    public static class MapTargetNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=11) public List<MapTargetNumMap> targetNumMap = new ArrayList<>();
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=4) public Boolean isOpen = null;
}
