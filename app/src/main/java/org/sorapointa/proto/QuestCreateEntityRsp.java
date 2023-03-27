package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestCreateEntityRsp {
    public enum QuestCreateEntityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=424) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Boolean isRewind = null;
    @Tag(tag=7) public Integer parentQuestId = null;
    @Tag(tag=12) public CreateEntityInfo entity = null;
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=3) public Integer questId = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
