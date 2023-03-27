package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ClientRemoveCombatEndModifierNotify {
    public enum ClientRemoveCombatEndModifierNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1106) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public List<Integer> combatEndTypeList = new ArrayList<>();
}
