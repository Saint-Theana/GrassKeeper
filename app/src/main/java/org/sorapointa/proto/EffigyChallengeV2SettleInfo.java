package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeV2SettleInfo {
    @Tag(tag=7) public Boolean isChallengeHighestDifficulty = null;
    @Tag(tag=4) public Integer createDungeonPlayerUid = null;
    @Tag(tag=6) public Integer challengeModeDifficulty = null;
    @Tag(tag=1) public Boolean isNewRecordTime = null;
    @Tag(tag=12) public Integer recordTime = null;
    @Tag(tag=5) public Integer firstTimeFinishDifficulty = null;
}
