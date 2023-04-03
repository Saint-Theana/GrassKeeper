package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ItemParam.*;
import org.sorapointa.proto.ItemParam;

public class BartenderCompleteOrderReq {
    public enum BartenderCompleteOrderReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8867) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Boolean isViewFormula = null;
    @Tag(tag=6) public Integer retryCount = null;
    @Tag(tag=8) public List<ItemParam> itemList = new ArrayList<>();
    @Tag(tag=12) public Integer qteCount = null;
    @Tag(tag=9) public Integer questId = null;
    @Tag(tag=15) public Integer cupType = null;
    @Tag(tag=11) public List<Integer> optionalOrderList = new ArrayList<>();
}
