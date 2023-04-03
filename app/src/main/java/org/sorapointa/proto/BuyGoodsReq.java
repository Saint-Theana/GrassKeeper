package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;

public class BuyGoodsReq {
    public enum BuyGoodsReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=787) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer buyCount = null;
    @Tag(tag=5) public Integer shopType = null;
    @Tag(tag=3) public ShopGoods goods = null;
}
