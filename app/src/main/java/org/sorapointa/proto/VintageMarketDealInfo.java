package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketDealInfo {
    public static class MapTraderItemInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintageMarketTraderInfo value = null;
    }

    @Tag(tag=13) public List<MapTraderItemInfoMap> traderItemInfoMap = new ArrayList<>();
}
