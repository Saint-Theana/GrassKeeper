package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.VintageCampChallengeLevelData.*;
import org.sorapointa.proto.VintageCampChallengeLevelData;

public class VintageCampChallengeStageData {
    public static class MapCampLevelMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public VintageCampChallengeLevelData value = null;
    }

    @Tag(tag=1) public List<MapCampLevelMap> campLevelMap = new ArrayList<>();
    @Tag(tag=13) public Boolean isOpen = null;
    @Tag(tag=7) public Integer maxFinishedLevel = null;
    @Tag(tag=4) public Boolean isFinish = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=10) public Integer openTime = null;
}
