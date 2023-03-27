package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientTriggerEventNotify {
    public enum ClientTriggerEventNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=178) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public Integer forceId = null;
    @Tag(tag=1) public Integer eventType = null;
}
