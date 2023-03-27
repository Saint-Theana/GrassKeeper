package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AbilityChangeNotify {
    public enum AbilityChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1124) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public AbilityControlBlock abilityControlBlock = null;
    @Tag(tag=7) public Integer entityId = null;
}
