package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class H5ActivityIdsNotify {
    public static class MapH5ActivityMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=1) public Integer clientRedDotTimestamp = null;
    @Tag(tag=12) public List<MapH5ActivityMap> h5ActivityMap = new ArrayList<>();
}
