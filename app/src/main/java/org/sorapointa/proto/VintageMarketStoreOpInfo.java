package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreOpInfo {
    @Tag(tag=14) public Integer helpUid = null;
    @Tag(tag=13) public Integer helpSkillId = null;
    @Tag(tag=3) public List<Integer> addAttrList = new ArrayList<>();
    @Tag(tag=2) public Integer storeId = null;
    @Tag(tag=4) public List<Integer> strategyList = new ArrayList<>();
}
