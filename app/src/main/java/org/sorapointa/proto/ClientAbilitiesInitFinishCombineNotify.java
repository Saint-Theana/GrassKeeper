package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientAbilitiesInitFinishCombineNotify {
    public enum ClientAbilitiesInitFinishCombineNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1180) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public List<EntityAbilityInvokeEntry> entityInvokeList = new ArrayList<>();
}
