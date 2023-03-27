package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonInterruptChallengeRsp {
    public enum DungeonInterruptChallengeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=963) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer groupId = null;
    @Tag(tag=10) public Integer challengeId = null;
    @Tag(tag=3) public Integer challengeIndex = null;
    @Tag(tag=13,isSigned=true) public Integer retcode = null;
}
