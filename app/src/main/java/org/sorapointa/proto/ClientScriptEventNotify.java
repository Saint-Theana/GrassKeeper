package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientScriptEventNotify {
    public enum ClientScriptEventNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=247) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer targetEntityId = null;
    @Tag(tag=1,isSigned=true) public List<Integer> paramList = new ArrayList<>();
    @Tag(tag=4) public Integer sourceEntityId = null;
    @Tag(tag=10) public Integer eventType = null;
}
