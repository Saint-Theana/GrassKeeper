package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseWidgetRetractGadgetReq {
    public enum UseWidgetRetractGadgetReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4251) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer entityId = null;
}
