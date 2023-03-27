package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreViewStrategyRsp {
    public enum BMHPOHCPOPC {
        @Tag(tag=0) None ,
        @Tag(tag=21369) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<Integer> strategyList = new ArrayList<>();
    @Tag(tag=15) public Integer strategyId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
