package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonInterruptChallengeReq {
    public enum DungeonInterruptChallengeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=927) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer groupId = null;
    @Tag(tag=1) public Integer challengeId = null;
    @Tag(tag=11) public Integer challengeIndex = null;
}
