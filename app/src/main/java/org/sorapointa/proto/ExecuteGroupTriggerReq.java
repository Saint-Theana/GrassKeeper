package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExecuteGroupTriggerReq {
    public enum ExecuteGroupTriggerReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=290) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2,isSigned=true) public Integer param3 = null;
    @Tag(tag=7,isSigned=true) public Integer param1 = null;
    @Tag(tag=8) public Integer sourceEntityId = null;
    @Tag(tag=4,isSigned=true) public Integer param2 = null;
    @Tag(tag=3) public Integer targetEntityId = null;
    @Tag(tag=5) public String sourceName = null;
}
