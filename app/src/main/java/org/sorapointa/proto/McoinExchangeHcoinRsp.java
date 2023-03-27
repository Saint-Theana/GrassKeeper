package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class McoinExchangeHcoinRsp {
    public enum McoinExchangeHcoinRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=667) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer mcoinCost = null;
    @Tag(tag=15) public Integer hcoin = null;
}
