package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShopCardProduct {
    public static class ShopCardProduct_ResinCard {
        @Tag(tag=1) public List<ItemParam> baseItemList = new ArrayList<>();
        @Tag(tag=2) public List<ItemParam> perDayItemList = new ArrayList<>();
    }

    @Tag(tag=1) public String productId = null;
    @Tag(tag=2) public String priceTier = null;
    @Tag(tag=3) public Integer mcoinBase = null;
    @Tag(tag=4) public Integer hcoinPerDay = null;
    @Tag(tag=5) public Integer days = null;
    @Tag(tag=6) public Integer remainRewardDays = null;
    @Tag(tag=7) public Integer cardProductType = null;
    @Tag(tag=101) public ShopCardProduct_ResinCard resinCard = null;
}
