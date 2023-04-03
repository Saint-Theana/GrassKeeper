package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopMcoinProduct.*;
import org.sorapointa.proto.ShopMcoinProduct;
import org.sorapointa.proto.ShopConcertProduct.*;
import org.sorapointa.proto.ShopConcertProduct;
import org.sorapointa.proto.ShopCardProduct.*;
import org.sorapointa.proto.ShopCardProduct;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;

public class Shop {
    @Tag(tag=6) public List<ShopMcoinProduct> mcoinProductList = new ArrayList<>();
    @Tag(tag=10) public Integer cityId = null;
    @Tag(tag=13) public List<ShopConcertProduct> concertProductList = new ArrayList<>();
    @Tag(tag=14) public Integer nextRefreshTime = null;
    @Tag(tag=9) public List<ShopCardProduct> cardProductList = new ArrayList<>();
    @Tag(tag=4) public Integer cityReputationLevel = null;
    @Tag(tag=5) public Integer shopType = null;
    @Tag(tag=15) public List<ShopGoods> goodsList = new ArrayList<>();
}
