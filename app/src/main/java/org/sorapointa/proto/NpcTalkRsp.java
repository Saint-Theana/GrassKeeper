package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NpcTalkRsp {
    public enum NpcTalkRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=555) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer npcEntityId = null;
    @Tag(tag=1) public Integer curTalkId = null;
    @Tag(tag=9) public Integer entityId = null;
}
