package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeDungeonResultInfo {
    @Tag(tag=7) public Integer challengeScore = null;
    @Tag(tag=8) public Boolean isInTimeLimit = null;
    @Tag(tag=6) public Integer challengeId = null;
    @Tag(tag=15) public Boolean isSuccess = null;
    @Tag(tag=13) public Integer challengeMaxScore = null;
}
