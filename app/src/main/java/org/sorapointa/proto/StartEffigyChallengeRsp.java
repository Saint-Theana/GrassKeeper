package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartEffigyChallengeRsp {
    public enum StartEffigyChallengeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2070) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer pointId = null;
    @Tag(tag=9) public Integer difficultyId = null;
    @Tag(tag=2) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=4) public Integer challengeId = null;
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
}
