package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreChooseStrategyRsp {
    @Tag(tag=15) public Integer storeId = null;
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public List<Integer> strategyList = new ArrayList<>();
}
