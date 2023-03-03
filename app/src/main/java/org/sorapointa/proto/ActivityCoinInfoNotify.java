package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityCoinInfoNotify {
    public static class MapActivityCoinMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=8) public Integer scheduleId = null;
    @Tag(tag=10) public Integer activityId = null;
    @Tag(tag=2) public List<MapActivityCoinMap> activityCoinMap = new ArrayList<>();
}
