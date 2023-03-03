package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ItemCdGroupTimeNotify {
    public static class MapItemCdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Long value = null;
    }

    @Tag(tag=9) public List<MapItemCdMap> itemCdMap = new ArrayList<>();
}
