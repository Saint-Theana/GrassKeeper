package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerBriefDataNotify {
    @Tag(tag=11) public Integer totalStarNum = null;
    @Tag(tag=8) public Integer lastFloorIndex = null;
    @Tag(tag=15) public Integer scheduleStartTime = null;
    @Tag(tag=6) public Integer nextScheduleChangeTime = null;
    @Tag(tag=14) public Boolean isFinishedEntranceFloor = null;
    @Tag(tag=4) public Integer lastLevelIndex = null;
    @Tag(tag=5) public Integer towerScheduleId = null;
}
