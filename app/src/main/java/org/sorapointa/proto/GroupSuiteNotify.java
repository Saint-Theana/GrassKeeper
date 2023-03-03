package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GroupSuiteNotify {
    public static class MapGroupMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public List<MapGroupMap> groupMap = new ArrayList<>();
}
