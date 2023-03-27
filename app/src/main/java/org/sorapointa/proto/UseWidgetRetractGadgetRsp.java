package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class UseWidgetRetractGadgetRsp {
    public enum UseWidgetRetractGadgetRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4289) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer entityId = null;
}
