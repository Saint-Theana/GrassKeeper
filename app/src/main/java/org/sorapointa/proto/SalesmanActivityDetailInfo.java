package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SalesmanStatusType.*;
import org.sorapointa.proto.SalesmanStatusType;

public class SalesmanActivityDetailInfo {
    public static class MapSelectedRewardIdMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=3) public Integer specialRewardPreviewId = null;
    @Tag(tag=4) public Integer status = null;
    @Tag(tag=2) public Integer lastDeliverTime = null;
    @Tag(tag=5) public List<MapSelectedRewardIdMap> selectedRewardIdMap = new ArrayList<>();
    @Tag(tag=11) public Integer deliverCount = null;
    @Tag(tag=7) public Boolean isHasTakenSpecialReward = null;
    @Tag(tag=12) public Integer dayIndex = null;
    @Tag(tag=6) public Integer condDayCount = null;
    @Tag(tag=9) public Integer dayRewardId = null;
    @Tag(tag=13) public Boolean isTodayHasDelivered = null;
}
