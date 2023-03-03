package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreViewStrategyRsp {
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=3) public List<Integer> strategyList = new ArrayList<>();
    @Tag(tag=14) public Integer strategyId = null;
}
