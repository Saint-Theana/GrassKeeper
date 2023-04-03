package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;

public class BuyGoodsRsp {
    public enum BuyGoodsRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=798) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer buyCount = null;
    @Tag(tag=1) public ShopGoods goods = null;
    @Tag(tag=7) public List<ShopGoods> goodsList = new ArrayList<>();
    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer shopType = null;
}
