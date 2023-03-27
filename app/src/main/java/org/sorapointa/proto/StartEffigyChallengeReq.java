package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartEffigyChallengeReq {
    public enum StartEffigyChallengeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2061) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public Integer difficultyId = null;
    @Tag(tag=2) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=9) public Integer pointId = null;
    @Tag(tag=15) public Integer challengeId = null;
}
