package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreViewStrategyReq {
    @Tag(tag=1) public Integer strategyId = null;
    @Tag(tag=14) public List<Integer> strategyList = new ArrayList<>();
}
