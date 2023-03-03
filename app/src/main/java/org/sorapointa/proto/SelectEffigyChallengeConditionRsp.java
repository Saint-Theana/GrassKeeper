package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectEffigyChallengeConditionRsp {
    @Tag(tag=12) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer difficultyId = null;
    @Tag(tag=2) public Integer challengeId = null;
}
