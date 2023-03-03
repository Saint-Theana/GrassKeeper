package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;

public class BuyGoodsRsp {
    @Tag(tag=14) public Integer buyCount = null;
    @Tag(tag=12) public ShopGoods goods = null;
    @Tag(tag=11) public Integer shopType = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=5) public List<ShopGoods> goodsList = new ArrayList<>();
}
