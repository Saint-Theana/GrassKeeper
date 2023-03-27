package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GivingRecord {
    public static class MapMaterialCntMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public Boolean isGadgetGiving = null;
    @Tag(tag=14) public Integer groupId = null;
    @Tag(tag=4) public Integer givingId = null;
    @Tag(tag=7) public Integer configId = null;
    @Tag(tag=8) public Integer lastGroupId = null;
    @Tag(tag=1) public Boolean isFinished = null;
    @Tag(tag=10) public List<MapMaterialCntMap> materialCntMap = new ArrayList<>();
}
