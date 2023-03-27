package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanDeliverItemReq {
    public enum SalesmanDeliverItemReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2117) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer scheduleId = null;
}
