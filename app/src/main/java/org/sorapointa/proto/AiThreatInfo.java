package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AiThreatInfo {
    public static class MapAiThreatMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=13) public List<MapAiThreatMap> aiThreatMap = new ArrayList<>();
}
