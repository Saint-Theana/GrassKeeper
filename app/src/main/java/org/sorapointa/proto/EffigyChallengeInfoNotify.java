package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeInfoNotify {
    public enum EffigyChallengeInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2164) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer challengeScore = null;
    @Tag(tag=2) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=7) public Integer difficultyId = null;
    @Tag(tag=8) public Integer challengeId = null;
}
