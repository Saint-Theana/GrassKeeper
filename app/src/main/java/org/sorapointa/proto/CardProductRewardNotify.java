package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class CardProductRewardNotify {
    public enum CardProductRewardNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4141) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public String productId = null;
    @Tag(tag=6) public Integer hcoin = null;
    @Tag(tag=7) public Integer remainDays = null;
}
