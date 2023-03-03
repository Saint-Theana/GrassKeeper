package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGAttackCostInfo {
    public static class MapCostMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=8) public Integer skillId = null;
    @Tag(tag=3) public List<MapCostMap> costMap = new ArrayList<>();
}
