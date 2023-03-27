package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerActivityStageInfo {
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=12) public Boolean isDungeonLevelUnlock = null;
    @Tag(tag=5) public Boolean isWorldLevelUnlock = null;
}
