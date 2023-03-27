package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TreasureMapBonusChallengeInfo {
    public static class MapFragmentMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Boolean value = null;
    }

    @Tag(tag=5) public Boolean isActive = null;
    @Tag(tag=13) public List<MapFragmentMap> fragmentMap = new ArrayList<>();
    @Tag(tag=14) public Integer solutionId = null;
    @Tag(tag=2) public Boolean isDone = null;
    @Tag(tag=9) public Integer configId = null;
}
