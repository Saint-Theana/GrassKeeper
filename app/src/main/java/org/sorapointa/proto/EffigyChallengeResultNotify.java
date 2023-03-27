package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeResultNotify {
    public enum EffigyChallengeResultNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2145) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer challengeId = null;
    @Tag(tag=1) public Integer challengeMaxScore = null;
    @Tag(tag=5) public Integer challengeScore = null;
    @Tag(tag=4) public Boolean isSuccess = null;
}
