package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ExecuteGadgetLuaReq {
    public enum ExecuteGadgetLuaReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=210) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15,isSigned=true) public Integer param2 = null;
    @Tag(tag=8,isSigned=true) public Integer param3 = null;
    @Tag(tag=6) public Integer sourceEntityId = null;
    @Tag(tag=14,isSigned=true) public Integer param1 = null;
}
