package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyEntityRsp {
    public enum QuestDestroyEntityRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=478) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer entityId = null;
    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=13) public Integer questId = null;
}
