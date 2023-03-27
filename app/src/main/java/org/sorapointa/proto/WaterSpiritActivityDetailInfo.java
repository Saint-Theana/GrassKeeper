package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class WaterSpiritActivityDetailInfo {
    public static class MapSearchTimeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=13) public Integer mpPlayId = null;
    @Tag(tag=3) public List<MapSearchTimeMap> searchTimeMap = new ArrayList<>();
    @Tag(tag=4) public Integer regionSearchId = null;
}
