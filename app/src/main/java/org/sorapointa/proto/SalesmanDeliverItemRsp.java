package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanDeliverItemRsp {
    public enum SalesmanDeliverItemRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2096) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
}
