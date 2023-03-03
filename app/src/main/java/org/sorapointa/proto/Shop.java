package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopCardProduct.*;
import org.sorapointa.proto.ShopCardProduct;
import org.sorapointa.proto.ShopConcertProduct.*;
import org.sorapointa.proto.ShopConcertProduct;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;
import org.sorapointa.proto.ShopMcoinProduct.*;
import org.sorapointa.proto.ShopMcoinProduct;

public class Shop {
    @Tag(tag=3) public List<ShopConcertProduct> concertProductList = new ArrayList<>();
    @Tag(tag=15) public List<ShopGoods> goodsList = new ArrayList<>();
    @Tag(tag=2) public Integer cityReputationLevel = null;
    @Tag(tag=14) public List<ShopCardProduct> cardProductList = new ArrayList<>();
    @Tag(tag=7) public List<ShopMcoinProduct> mcoinProductList = new ArrayList<>();
    @Tag(tag=11) public Integer nextRefreshTime = null;
    @Tag(tag=10) public Integer cityId = null;
    @Tag(tag=13) public Integer shopType = null;
}
