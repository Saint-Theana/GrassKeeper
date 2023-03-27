package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class QuestTransmitReq {
    public enum QuestTransmitReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=442) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer questId = null;
    @Tag(tag=3) public Integer pointId = null;
}
