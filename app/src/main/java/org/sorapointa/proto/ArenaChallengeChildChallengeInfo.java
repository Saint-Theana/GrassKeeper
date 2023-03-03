package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ArenaChallengeChildChallengeInfo {
    @Tag(tag=12) public Integer challengeId = null;
    @Tag(tag=5) public Integer challengeType = null;
    @Tag(tag=4) public Integer challengeIndex = null;
    @Tag(tag=7) public Boolean isSuccess = null;
    @Tag(tag=11) public Boolean isSettled = null;
}
