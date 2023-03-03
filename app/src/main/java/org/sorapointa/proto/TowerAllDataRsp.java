package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TowerCurLevelRecord.*;
import org.sorapointa.proto.TowerCurLevelRecord;
import org.sorapointa.proto.TowerFloorRecord.*;
import org.sorapointa.proto.TowerFloorRecord;
import org.sorapointa.proto.TowerMonthlyBrief.*;
import org.sorapointa.proto.TowerMonthlyBrief;

public class TowerAllDataRsp {
    public static class MapSkipFloorGrantedRewardItemMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapFloorOpenTimeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=10) public Integer towerScheduleId = null;
    @Tag(tag=9) public Integer dailyLevelIndex = null;
    @Tag(tag=12) public List<MapSkipFloorGrantedRewardItemMap> skipFloorGrantedRewardItemMap = new ArrayList<>();
    @Tag(tag=3) public Boolean isFirstInteract = null;
    @Tag(tag=1) public Boolean isFinishedEntranceFloor = null;
    @Tag(tag=5) public List<TowerFloorRecord> towerFloorRecordList = new ArrayList<>();
    @Tag(tag=11) public Integer dailyFloorId = null;
    @Tag(tag=13) public Integer commemorativeRewardId = null;
    @Tag(tag=1222) public TowerMonthlyBrief lastScheduleMonthlyBrief = null;
    @Tag(tag=6) public Integer nextScheduleChangeTime = null;
    @Tag(tag=7) public Integer validTowerRecordNum = null;
    @Tag(tag=2) public Integer skipToFloorIndex = null;
    @Tag(tag=4) public List<MapFloorOpenTimeMap> floorOpenTimeMap = new ArrayList<>();
    @Tag(tag=15) public TowerCurLevelRecord curLevelRecord = null;
    @Tag(tag=8,isSigned=true) public Integer retcode = null;
    @Tag(tag=914) public Integer scheduleStartTime = null;
    @Tag(tag=14) public TowerMonthlyBrief monthlyBrief = null;
}
