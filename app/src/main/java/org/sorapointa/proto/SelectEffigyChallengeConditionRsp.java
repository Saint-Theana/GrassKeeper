package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectEffigyChallengeConditionRsp {
    public enum SelectEffigyChallengeConditionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2068) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=1) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=11) public Integer challengeId = null;
    @Tag(tag=10) public Integer difficultyId = null;
}
