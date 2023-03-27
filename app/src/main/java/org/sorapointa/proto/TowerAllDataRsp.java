package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TowerAllDataRsp {
    public static class MapFloorOpenTimeMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public static class MapSkipFloorGrantedRewardItemMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum TowerAllDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2462) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer dailyLevelIndex = null;
    @Tag(tag=1) public TowerCurLevelRecord curLevelRecord = null;
    @Tag(tag=8) public Boolean isFirstInteract = null;
    @Tag(tag=6) public List<TowerFloorRecord> towerFloorRecordList = new ArrayList<>();
    @Tag(tag=15) public Integer nextScheduleChangeTime = null;
    @Tag(tag=9) public Integer towerScheduleId = null;
    @Tag(tag=12) public List<MapFloorOpenTimeMap> floorOpenTimeMap = new ArrayList<>();
    @Tag(tag=5) public Integer validTowerRecordNum = null;
    @Tag(tag=11) public List<MapSkipFloorGrantedRewardItemMap> skipFloorGrantedRewardItemMap = new ArrayList<>();
    @Tag(tag=591) public Integer scheduleStartTime = null;
    @Tag(tag=1482) public TowerMonthlyBrief lastScheduleMonthlyBrief = null;
    @Tag(tag=10) public Integer skipToFloorIndex = null;
    @Tag(tag=3) public Integer commemorativeRewardId = null;
    @Tag(tag=14) public Integer dailyFloorId = null;
    @Tag(tag=2) public Boolean isFinishedEntranceFloor = null;
    @Tag(tag=13) public TowerMonthlyBrief monthlyBrief = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
