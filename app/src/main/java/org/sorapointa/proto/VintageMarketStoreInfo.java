package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreInfo {
    @Tag(tag=2) public List<Integer> strategyList = new ArrayList<>();
    @Tag(tag=8) public Integer storeId = null;
    @Tag(tag=7) public Integer slotCount = null;
    @Tag(tag=10) public List<Integer> nextAimAttrList = new ArrayList<>();
    @Tag(tag=12) public List<Integer> curAttrList = new ArrayList<>();
}
