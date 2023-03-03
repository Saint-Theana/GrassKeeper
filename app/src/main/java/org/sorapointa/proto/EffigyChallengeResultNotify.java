package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeResultNotify {
    @Tag(tag=5) public Boolean isSuccess = null;
    @Tag(tag=12) public Integer challengeMaxScore = null;
    @Tag(tag=3) public Integer challengeScore = null;
    @Tag(tag=7) public Integer challengeId = null;
}
