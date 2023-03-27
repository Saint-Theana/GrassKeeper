package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlantFlowerAcceptFlowerResultInfo {
    public static class MapUnacceptFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapAcceptFlowerNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=9) public List<MapUnacceptFlowerNumMap> unacceptFlowerNumMap = new ArrayList<>();
    @Tag(tag=10) public Integer uid = null;
    @Tag(tag=4) public List<MapAcceptFlowerNumMap> acceptFlowerNumMap = new ArrayList<>();
}
