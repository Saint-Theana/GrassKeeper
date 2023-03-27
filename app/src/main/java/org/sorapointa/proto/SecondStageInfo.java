package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SecondStageInfo {
    public static class MapAnimalCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=7) public List<MapAnimalCountMap> animalCountMap = new ArrayList<>();
    @Tag(tag=14) public Integer totalNum = null;
    @Tag(tag=1) public Integer captureAnimalNum = null;
}
