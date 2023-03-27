package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeResourceBonusPropUpdateNotify {
    public enum RoguelikeResourceBonusPropUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8858) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2,isFloat=true) public Float bonusResourceProp = null;
}
