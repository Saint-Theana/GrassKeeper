package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GivingRecord {
    public static class MapMaterialCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=9) public Boolean isFinished = null;
    @Tag(tag=5) public Integer groupId = null;
    @Tag(tag=8) public Boolean isGadgetGiving = null;
    @Tag(tag=3) public Integer givingId = null;
    @Tag(tag=6) public Integer lastGroupId = null;
    @Tag(tag=2) public Integer configId = null;
    @Tag(tag=15) public List<MapMaterialCountMap> materialCountMap = new ArrayList<>();
}
