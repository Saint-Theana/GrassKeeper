package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeLimitedShopGoods {
    @Tag(tag=5) public Integer disableType = null;
    @Tag(tag=12) public ItemParam goodsItem = null;
    @Tag(tag=6) public Integer goodsId = null;
    @Tag(tag=15) public List<ItemParam> costItemList = new ArrayList<>();
    @Tag(tag=7) public Integer boughtNum = null;
    @Tag(tag=13) public Integer buyLimit = null;
}
