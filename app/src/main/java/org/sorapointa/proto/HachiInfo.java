package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HachiInfo {
    public static class MapStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public HachiStageInfo value = null;
    }

    @Tag(tag=9) public List<MapStageMap> stageMap = new ArrayList<>();
}
