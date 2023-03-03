package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageHuntingSecondStageSettleInfo {
    public static class MapAnimalCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public List<MapAnimalCountMap> animalCountMap = new ArrayList<>();
    @Tag(tag=7) public Integer captureAnimalNum = null;
    @Tag(tag=15) public Integer totalNum = null;
}
