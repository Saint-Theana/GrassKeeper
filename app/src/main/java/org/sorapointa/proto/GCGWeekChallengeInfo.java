package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGWeekChallengeInfo {
    @Tag(tag=4) public Integer npcId = null;
    @Tag(tag=7) public Boolean isFinished = null;
    @Tag(tag=1) public Integer unlockTime = null;
}
