package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeExchangeWoodReq {
    public static class MapMaterialCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public List<MapMaterialCountMap> materialCountMap = new ArrayList<>();
    @Tag(tag=12) public Integer woodId = null;
}
