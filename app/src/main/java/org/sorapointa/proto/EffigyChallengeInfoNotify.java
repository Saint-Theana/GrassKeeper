package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeInfoNotify {
    @Tag(tag=9) public Integer difficultyId = null;
    @Tag(tag=11) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=14) public Integer challengeScore = null;
    @Tag(tag=8) public Integer challengeId = null;
}
