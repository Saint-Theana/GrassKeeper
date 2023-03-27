package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketDeliverItemReq {
    public enum IADAEOHIPCK {
        @Tag(tag=0) None ,
        @Tag(tag=21636) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public List<ItemParam> deliverItemList = new ArrayList<>();
    @Tag(tag=4) public Integer traderId = null;
}
