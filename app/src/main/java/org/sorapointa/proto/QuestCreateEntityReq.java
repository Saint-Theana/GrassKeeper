package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestCreateEntityReq {
    public enum QuestCreateEntityReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=414) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer parentQuestId = null;
    @Tag(tag=12) public Boolean isRewind = null;
    @Tag(tag=11) public CreateEntityInfo entity = null;
    @Tag(tag=10) public Integer questId = null;
}
