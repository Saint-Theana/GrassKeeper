package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExecuteGroupTriggerRsp {
    public enum ExecuteGroupTriggerRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=254) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
