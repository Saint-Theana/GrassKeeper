package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoguelikeRuneRecordUpdateNotify {
    public enum RoguelikeRuneRecordUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8401) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public List<RoguelikeRuneRecord> runeRecordList = new ArrayList<>();
}
