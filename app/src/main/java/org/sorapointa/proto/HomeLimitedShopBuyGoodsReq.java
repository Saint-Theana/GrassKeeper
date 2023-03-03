package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopGoods.*;
import org.sorapointa.proto.HomeLimitedShopGoods;

public class HomeLimitedShopBuyGoodsReq {
    @Tag(tag=3) public HomeLimitedShopGoods goods = null;
    @Tag(tag=10) public Integer buyCount = null;
}
