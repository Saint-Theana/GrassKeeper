package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ArenaChallengeChildChallengeInfo {
    @Tag(tag=15) public Boolean isSuccess = null;
    @Tag(tag=4) public Boolean isSettled = null;
    @Tag(tag=5) public Integer challengeType = null;
    @Tag(tag=8) public Integer challengeIndex = null;
    @Tag(tag=14) public Integer challengeId = null;
}
