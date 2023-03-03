package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGPlayCardCostInfo {
    public static class MapCostMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14) public List<MapCostMap> costMap = new ArrayList<>();
    @Tag(tag=1) public Integer cardId = null;
}
