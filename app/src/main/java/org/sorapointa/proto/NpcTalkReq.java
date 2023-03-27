package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class NpcTalkReq {
    public enum NpcTalkReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=505) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer npcEntityId = null;
    @Tag(tag=11) public Integer entityId = null;
    @Tag(tag=15) public Integer talkId = null;
}
