package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreViewStrategyReq {
    public enum NKILKBBKFPN {
        @Tag(tag=0) None ,
        @Tag(tag=24026) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer strategyId = null;
    @Tag(tag=15) public List<Integer> strategyList = new ArrayList<>();
}
