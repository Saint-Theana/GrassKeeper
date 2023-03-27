package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ShopGoods {
    @Tag(tag=655) public Integer discountEndTime = null;
    @Tag(tag=3) public Integer maxLevel = null;
    @Tag(tag=13) public Integer hcoin = null;
    @Tag(tag=363) public Integer secondarySheetId = null;
    @Tag(tag=11) public Integer scoin = null;
    @Tag(tag=2) public Integer goodsId = null;
    @Tag(tag=10) public Integer buyLimit = null;
    @Tag(tag=12) public List<Integer> preGoodsIdList = new ArrayList<>();
    @Tag(tag=6) public ItemParam goodsItem = null;
    @Tag(tag=7) public List<ItemParam> costItemList = new ArrayList<>();
    @Tag(tag=424) public Integer singleLimit = null;
    @Tag(tag=1) public Integer nextRefreshTime = null;
    @Tag(tag=182) public Integer discountId = null;
    @Tag(tag=4) public Integer boughtNum = null;
    @Tag(tag=636) public Integer discountBeginTime = null;
    @Tag(tag=14) public Integer minLevel = null;
    @Tag(tag=15) public Integer endTime = null;
    @Tag(tag=8) public Integer beginTime = null;
    @Tag(tag=9) public Integer disableType = null;
    @Tag(tag=5) public Integer mcoin = null;
}
