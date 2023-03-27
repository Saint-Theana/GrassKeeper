package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreChooseStrategyReq {
    public enum MEMBHLBAAFD {
        @Tag(tag=0) None ,
        @Tag(tag=20971) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer storeId = null;
    @Tag(tag=2) public List<Integer> strategyList = new ArrayList<>();
    @Tag(tag=15) public List<VintageMarketStoreOpInfo> storeOpList = new ArrayList<>();
}
