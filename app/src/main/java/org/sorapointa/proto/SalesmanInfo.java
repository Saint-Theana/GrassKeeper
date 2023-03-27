package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SalesmanInfo {
    public static class MapSelectedRewardIdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=4) public Integer status = null;
    @Tag(tag=7) public Integer lastDeliverTime = null;
    @Tag(tag=6) public Integer specialRewardPreviewId = null;
    @Tag(tag=8) public Integer dayIndex = null;
    @Tag(tag=15) public Boolean isTodayHasDelivered = null;
    @Tag(tag=13) public List<MapSelectedRewardIdMap> selectedRewardIdMap = new ArrayList<>();
    @Tag(tag=11) public Integer condDayCount = null;
    @Tag(tag=5) public Boolean isHasTakenSpecialReward = null;
    @Tag(tag=2) public Integer dayRewardId = null;
    @Tag(tag=9) public Integer deliverCount = null;
}
