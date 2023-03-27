package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketStoreChooseStrategyRsp {
    public enum NPJKKPABAAI {
        @Tag(tag=0) None ,
        @Tag(tag=23497) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<Integer> strategyList = new ArrayList<>();
    @Tag(tag=15) public Integer storeId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
}
