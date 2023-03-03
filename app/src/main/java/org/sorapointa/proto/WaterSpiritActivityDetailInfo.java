package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WaterSpiritActivityDetailInfo {
    public static class MapSearchTimeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=9) public List<MapSearchTimeMap> searchTimeMap = new ArrayList<>();
    @Tag(tag=2) public Integer regionSearchId = null;
    @Tag(tag=15) public Integer mpPlayId = null;
}
