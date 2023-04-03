package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CombatInvokeEntry.*;
import org.sorapointa.proto.CombatInvokeEntry;

public class CombatInvocationsNotify {
    public enum CombatInvocationsNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=323) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public List<CombatInvokeEntry> invokeList = new ArrayList<>();
}
