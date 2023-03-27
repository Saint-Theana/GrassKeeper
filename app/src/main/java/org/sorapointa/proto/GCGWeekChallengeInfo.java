package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGWeekChallengeInfo {
    @Tag(tag=12) public Boolean isFinished = null;
    @Tag(tag=14) public Integer npcId = null;
    @Tag(tag=15) public Integer unlockTime = null;
}
