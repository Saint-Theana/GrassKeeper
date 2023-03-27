package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class VintageMarketDeliverItemRsp {
    public enum MLCPBOCDIPB {
        @Tag(tag=0) None ,
        @Tag(tag=21050) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer traderId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
