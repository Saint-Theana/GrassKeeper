package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyNpcReq {
    public enum QuestDestroyNpcReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=492) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer parentQuestId = null;
    @Tag(tag=7) public Integer npcId = null;
}
