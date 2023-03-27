package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientAbilityChangeNotify {
    public enum ClientAbilityChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1129) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public List<AbilityInvokeEntry> invokes = new ArrayList<>();
    @Tag(tag=4) public Boolean isInitHash = null;
    @Tag(tag=9) public Integer entityId = null;
}
