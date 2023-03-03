package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GadgetChainLevelChangeNotify {
    public static class MapGadgetChainLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=2) public List<MapGadgetChainLevelMap> gadgetChainLevelMap = new ArrayList<>();
}
