package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ArenaChallengeFinishNotify {
    public enum ArenaChallengeFinishNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2199) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=6) public List<ArenaChallengeChildChallengeInfo> childChallengeList = new ArrayList<>();
    @Tag(tag=15) public Integer arenaChallengeId = null;
    @Tag(tag=9) public Integer arenaChallengeLevel = null;
}
