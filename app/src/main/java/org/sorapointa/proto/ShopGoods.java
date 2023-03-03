package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class ShopGoods {
    @Tag(tag=258) public Integer discountEndTime = null;
    @Tag(tag=8) public Integer minLevel = null;
    @Tag(tag=11) public Integer endTime = null;
    @Tag(tag=3) public List<ItemParam> costItemList = new ArrayList<>();
    @Tag(tag=318) public Integer secondarySheetId = null;
    @Tag(tag=1) public Integer hcoin = null;
    @Tag(tag=14) public Integer mcoin = null;
    @Tag(tag=1998) public Integer discountId = null;
    @Tag(tag=247) public Integer singleLimit = null;
    @Tag(tag=13) public Integer goodsId = null;
    @Tag(tag=7) public Integer nextRefreshTime = null;
    @Tag(tag=4) public Integer maxLevel = null;
    @Tag(tag=6) public Integer disableType = null;
    @Tag(tag=574) public Integer discountBeginTime = null;
    @Tag(tag=2) public List<Integer> preGoodsIdList = new ArrayList<>();
    @Tag(tag=5) public Integer beginTime = null;
    @Tag(tag=15) public Integer scoin = null;
    @Tag(tag=10) public Integer boughtNum = null;
    @Tag(tag=12) public Integer buyLimit = null;
    @Tag(tag=9) public ItemParam goodsItem = null;
}
