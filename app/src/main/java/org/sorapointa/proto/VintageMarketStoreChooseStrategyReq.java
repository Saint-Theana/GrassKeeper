package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageMarketStoreOpInfo.*;
import org.sorapointa.proto.VintageMarketStoreOpInfo;

public class VintageMarketStoreChooseStrategyReq {
    @Tag(tag=6) public Integer storeId = null;
    @Tag(tag=9) public List<VintageMarketStoreOpInfo> storeOpList = new ArrayList<>();
    @Tag(tag=8) public List<Integer> strategyList = new ArrayList<>();
}
