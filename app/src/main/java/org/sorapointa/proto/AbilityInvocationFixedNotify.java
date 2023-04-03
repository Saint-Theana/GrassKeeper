package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AbilityInvokeEntry.*;
import org.sorapointa.proto.AbilityInvokeEntry;

public class AbilityInvocationFixedNotify {
    public enum AbilityInvocationFixedNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1105) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public AbilityInvokeEntry invoke2Nd = null;
    @Tag(tag=6) public AbilityInvokeEntry invoke3Rd = null;
    @Tag(tag=8) public AbilityInvokeEntry invoke5Th = null;
    @Tag(tag=5) public AbilityInvokeEntry invoke4Th = null;
    @Tag(tag=15) public AbilityInvokeEntry invoke6Th = null;
    @Tag(tag=1) public AbilityInvokeEntry invoke1St = null;
}
