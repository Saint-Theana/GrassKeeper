package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreOpInfo {
    @Tag(tag=5) public List<Integer> strategyList = new ArrayList<>();
    @Tag(tag=9) public Integer helpUid = null;
    @Tag(tag=2) public Integer storeId = null;
    @Tag(tag=7) public Integer helpSkillId = null;
    @Tag(tag=15) public List<Integer> addAttrList = new ArrayList<>();
}
