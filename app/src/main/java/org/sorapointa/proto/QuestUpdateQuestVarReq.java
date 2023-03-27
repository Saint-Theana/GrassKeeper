package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestUpdateQuestVarReq {
    public enum QuestUpdateQuestVarReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=439) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer parentQuestVarSeq = null;
    @Tag(tag=12) public Integer parentQuestId = null;
    @Tag(tag=4) public List<QuestVarOp> questVarOpList = new ArrayList<>();
    @Tag(tag=3) public Integer questId = null;
}
