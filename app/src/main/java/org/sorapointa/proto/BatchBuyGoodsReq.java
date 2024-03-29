package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.BuyGoodsParam.*;
import org.sorapointa.proto.BuyGoodsParam;

public class BatchBuyGoodsReq {
    public enum BJBCIEHJADP {
        @Tag(tag=0) None ,
        @Tag(tag=762) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public List<BuyGoodsParam> buyGoodsList = new ArrayList<>();
    @Tag(tag=3) public Integer shopType = null;
}
