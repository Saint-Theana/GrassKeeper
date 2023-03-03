package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SelectEffigyChallengeConditionReq {
    @Tag(tag=15) public Integer difficultyId = null;
    @Tag(tag=7) public Integer challengeId = null;
    @Tag(tag=9) public List<Integer> conditionIdList = new ArrayList<>();
}
