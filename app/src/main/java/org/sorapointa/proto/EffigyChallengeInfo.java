package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EffigyChallengeInfo {
    @Tag(tag=5) public Integer bossViolentLevel = null;
    @Tag(tag=12) public Integer totalTargetKillCnt = null;
    @Tag(tag=8) public Integer killedMonsterCnt = null;
    @Tag(tag=13) public Integer sceneStartTime = null;
    @Tag(tag=6) public Integer tRemainUseTime = null;
}
