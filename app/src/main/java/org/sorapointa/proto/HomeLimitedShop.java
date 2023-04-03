package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopGoods.*;
import org.sorapointa.proto.HomeLimitedShopGoods;

public class HomeLimitedShop {
    @Tag(tag=9) public List<HomeLimitedShopGoods> goodsList = new ArrayList<>();
}
