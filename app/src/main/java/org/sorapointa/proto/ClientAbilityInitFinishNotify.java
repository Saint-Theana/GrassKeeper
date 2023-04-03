package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class ClientAbilityInitFinishNotify {
    public enum ClientAbilityInitFinishNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1198) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=14) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
}
