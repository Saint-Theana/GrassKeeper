package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopGoods.*;
import org.sorapointa.proto.HomeLimitedShopGoods;

public class HomeLimitedShopBuyGoodsRsp {
    @Tag(tag=13) public List<HomeLimitedShopGoods> goodsList = new ArrayList<>();
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public HomeLimitedShopGoods goods = null;
    @Tag(tag=8) public Integer buyCount = null;
}
