package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestDestroyEntityReq {
    public enum QuestDestroyEntityReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=429) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=12) public Integer questId = null;
    @Tag(tag=13) public Integer sceneId = null;
}
