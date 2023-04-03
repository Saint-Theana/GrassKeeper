package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopGoods.*;
import org.sorapointa.proto.HomeLimitedShopGoods;

public class HomeLimitedShopBuyGoodsReq {
    public enum HomeLimitedShopBuyGoodsReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4647) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public HomeLimitedShopGoods goods = null;
    @Tag(tag=10) public Integer buyCount = null;
}
