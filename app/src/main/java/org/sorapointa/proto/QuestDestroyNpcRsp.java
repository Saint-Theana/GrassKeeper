package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyNpcRsp {
    public enum QuestDestroyNpcRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=488) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer npcId = null;
    @Tag(tag=6) public Integer parentQuestId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
}
