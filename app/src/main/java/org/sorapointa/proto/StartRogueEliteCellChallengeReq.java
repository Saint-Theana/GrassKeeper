package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartRogueEliteCellChallengeReq {
    public enum StartRogueEliteCellChallengeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8981) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public Integer cellId = null;
    @Tag(tag=7) public Integer difficulty = null;
    @Tag(tag=2) public Integer dungeonId = null;
}
