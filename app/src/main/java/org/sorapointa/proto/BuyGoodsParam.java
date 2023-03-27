package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BuyGoodsParam {
    @Tag(tag=8) public ShopGoods goods = null;
    @Tag(tag=3) public Integer buyCount = null;
}
