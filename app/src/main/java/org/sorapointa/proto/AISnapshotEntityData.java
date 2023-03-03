package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.AISnapshotEntitySkillCycle.*;
import org.sorapointa.proto.AISnapshotEntitySkillCycle;

public class AISnapshotEntityData {
    public static class MapHittingAvatars {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=5,isFloat=true) public Float tickTime = null;
    @Tag(tag=2) public Integer tactic = null;
    @Tag(tag=9) public List<AISnapshotEntitySkillCycle> finishedSkillCycles = new ArrayList<>();
    @Tag(tag=4,isFloat=true) public Float movedDistance = null;
    @Tag(tag=13) public Integer aiTargetId = null;
    @Tag(tag=3) public Integer threatTargetId = null;
    @Tag(tag=1) public Integer threatListSize = null;
    @Tag(tag=15) public Integer entityId = null;
    @Tag(tag=7) public List<MapHittingAvatars> hittingAvatars = new ArrayList<>();
    @Tag(tag=11,isFloat=true) public Float distanceToPlayer = null;
    @Tag(tag=10) public Integer attackTargetId = null;
    @Tag(tag=14,isFloat=true) public Float realTime = null;
}
