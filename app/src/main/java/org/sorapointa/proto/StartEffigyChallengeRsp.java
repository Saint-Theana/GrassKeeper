package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class StartEffigyChallengeRsp {
    @Tag(tag=2) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer challengeId = null;
    @Tag(tag=10) public Integer difficultyId = null;
    @Tag(tag=12) public Integer pointId = null;
}
