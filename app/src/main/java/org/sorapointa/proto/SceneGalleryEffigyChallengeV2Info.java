package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneGalleryEffigyChallengeV2Info {
    @Tag(tag=10) public Integer killedMonsterCnt = null;
    @Tag(tag=15) public Integer totalTargetKillCnt = null;
    @Tag(tag=14) public Integer sceneStartTime = null;
    @Tag(tag=6) public Integer tRemainUseTime = null;
    @Tag(tag=9) public Integer bossViolentLevel = null;
}
