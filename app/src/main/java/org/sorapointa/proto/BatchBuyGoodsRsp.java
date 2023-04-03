package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ShopGoods.*;
import org.sorapointa.proto.ShopGoods;
import org.sorapointa.proto.BuyGoodsParam.*;
import org.sorapointa.proto.BuyGoodsParam;

public class BatchBuyGoodsRsp {
    public enum PEONLFKKKFC {
        @Tag(tag=0) None ,
        @Tag(tag=714) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public List<ShopGoods> goodsList = new ArrayList<>();
    @Tag(tag=14) public Integer shopType = null;
    @Tag(tag=3) public List<BuyGoodsParam> buyGoodsList = new ArrayList<>();
}
