package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum BattlePassMission_MissionStatus {
        @Tag(tag=0) MissionInvalid ,
        @Tag(tag=1) MissionUnfinished ,
        @Tag(tag=2) MissionFinished ,
        @Tag(tag=3) MissionPointTaken ;
}
