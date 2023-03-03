package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BattlePassMission {
    public enum MissionStatus {
        @Tag(tag=0) MISSION_STATUS_INVALID ,
        @Tag(tag=1) MISSION_STATUS_UNFINISHED ,
        @Tag(tag=2) MISSION_STATUS_FINISHED ,
        @Tag(tag=3) MISSION_STATUS_POINT_TAKEN ;
    }

    @Tag(tag=13) public Integer curProgress = null;
    @Tag(tag=15) public MissionStatus missionStatus = null;
    @Tag(tag=11) public Integer missionId = null;
    @Tag(tag=3) public Integer rewardBattlePassPoint = null;
    @Tag(tag=12) public Integer missionType = null;
    @Tag(tag=6) public Integer totalProgress = null;
}
