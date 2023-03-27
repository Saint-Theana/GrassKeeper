package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BargainOfferPriceReq {
    public enum BargainOfferPriceReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=458) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer bargainId = null;
    @Tag(tag=7) public Integer price = null;
}
