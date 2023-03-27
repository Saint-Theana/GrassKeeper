package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeDungeonResultInfo {
    @Tag(tag=6) public Integer challengeMaxScore = null;
    @Tag(tag=1) public Boolean isInTimeLimit = null;
    @Tag(tag=14) public Integer challengeScore = null;
    @Tag(tag=2) public Boolean isSuccess = null;
    @Tag(tag=10) public Integer challengeId = null;
}
