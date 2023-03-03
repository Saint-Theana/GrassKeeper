package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartEffigyChallengeReq {
    @Tag(tag=9) public Integer difficultyId = null;
    @Tag(tag=6) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=1) public Integer challengeId = null;
    @Tag(tag=12) public Integer pointId = null;
}
