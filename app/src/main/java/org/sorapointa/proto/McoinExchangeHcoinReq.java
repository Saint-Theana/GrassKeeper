package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class McoinExchangeHcoinReq {
    public enum McoinExchangeHcoinReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=695) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer mcoinCost = null;
    @Tag(tag=13) public Integer hcoin = null;
}
