package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestUpdateQuestVarNotify {
    public enum QuestUpdateQuestVarNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=500) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer parentQuestId = null;
    @Tag(tag=14) public Integer parentQuestVarSeq = null;
    @Tag(tag=7,isSigned=true) public List<Integer> questVar = new ArrayList<>();
}
