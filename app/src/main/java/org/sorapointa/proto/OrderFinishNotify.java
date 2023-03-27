package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class OrderFinishNotify {
    public enum OrderFinishNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4146) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer addMcoin = null;
    @Tag(tag=3) public Integer cardProductRemainDays = null;
    @Tag(tag=5) public Integer orderId = null;
    @Tag(tag=8) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=13) public String productId = null;
}
