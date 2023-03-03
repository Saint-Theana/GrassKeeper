package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeCustomFurnitureInfo.*;
import org.sorapointa.proto.HomeCustomFurnitureInfo;

public class HomeCustomFurnitureInfoNotify {
    public static class MapUsedSubFurnitureCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=4) public List<Integer> deleteCustomFurnitureList = new ArrayList<>();
    @Tag(tag=15) public List<MapUsedSubFurnitureCountMap> usedSubFurnitureCountMap = new ArrayList<>();
    @Tag(tag=11) public List<HomeCustomFurnitureInfo> customFurnitureInfoList = new ArrayList<>();
}
