package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class HomeLimitedShopGoods {
    @Tag(tag=8) public Integer buyLimit = null;
    @Tag(tag=15) public List<ItemParam> costItemList = new ArrayList<>();
    @Tag(tag=1) public Integer boughtNum = null;
    @Tag(tag=6) public ItemParam goodsItem = null;
    @Tag(tag=13) public Integer goodsId = null;
    @Tag(tag=3) public Integer disableType = null;
}
