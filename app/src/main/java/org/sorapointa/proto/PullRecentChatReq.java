package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PullRecentChatReq {
    public enum PullRecentChatReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5020) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public Integer beginSequence = null;
    @Tag(tag=2) public Integer pullNum = null;
}
