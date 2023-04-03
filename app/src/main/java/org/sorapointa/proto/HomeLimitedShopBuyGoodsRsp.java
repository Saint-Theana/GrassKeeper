package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeLimitedShopGoods.*;
import org.sorapointa.proto.HomeLimitedShopGoods;

public class HomeLimitedShopBuyGoodsRsp {
    public enum HomeLimitedShopBuyGoodsRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4865) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<HomeLimitedShopGoods> goodsList = new ArrayList<>();
    @Tag(tag=8) public HomeLimitedShopGoods goods = null;
    @Tag(tag=11) public Integer buyCount = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
