package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeEffectDataNotify {
    public enum RoguelikeEffectDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8256) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public List<RogueEffectRecord> curseList = new ArrayList<>();
    @Tag(tag=1) public List<RogueEffectRecord> cardList = new ArrayList<>();
}
