package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class AbilityInvocationFailNotify {
    public enum AbilityInvocationFailNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1120) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public String reason = null;
    @Tag(tag=13) public Integer entityId = null;
    @Tag(tag=14) public AbilityInvokeEntry invoke = null;
}
