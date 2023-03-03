package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;

public class BuyGoodsReq {
    @Tag(tag=14) public Integer buyCount = null;
    @Tag(tag=15) public ShopGoods goods = null;
    @Tag(tag=7) public Integer shopType = null;
}
