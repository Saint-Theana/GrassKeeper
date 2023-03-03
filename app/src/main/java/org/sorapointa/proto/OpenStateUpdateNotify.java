package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OpenStateUpdateNotify {
    public static class MapOpenStateMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=6) public List<MapOpenStateMap> openStateMap = new ArrayList<>();
}
