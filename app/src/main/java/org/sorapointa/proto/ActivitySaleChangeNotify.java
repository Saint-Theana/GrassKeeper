package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivitySaleChangeNotify {
    public enum ActivitySaleChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2058) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer saleId = null;
    @Tag(tag=8) public Boolean isClose = null;
}
