package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2SettleInfo {
    @Tag(tag=14) public Integer createDungeonPlayerUid = null;
    @Tag(tag=5) public Boolean isNewRecordTime = null;
    @Tag(tag=15) public Integer recordTime = null;
    @Tag(tag=10) public Integer firstTimeFinishDifficulty = null;
    @Tag(tag=13) public Integer challengeModeDifficulty = null;
    @Tag(tag=1) public Boolean isChallengeHighestDifficulty = null;
}
