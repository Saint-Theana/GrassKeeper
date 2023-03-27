package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerBriefDataNotify {
    public enum TowerBriefDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2405) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Boolean isFinishedEntranceFloor = null;
    @Tag(tag=5) public Integer totalStarNum = null;
    @Tag(tag=3) public Integer towerScheduleId = null;
    @Tag(tag=4) public Integer lastFloorIndex = null;
    @Tag(tag=13) public Integer scheduleStartTime = null;
    @Tag(tag=12) public Integer nextScheduleChangeTime = null;
    @Tag(tag=14) public Integer lastLevelIndex = null;
}
