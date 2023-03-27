package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityCoinInfoNotify {
    public static class MapActivityCoinMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum ActivityCoinInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2055) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer activityId = null;
    @Tag(tag=14) public List<MapActivityCoinMap> activityCoinMap = new ArrayList<>();
    @Tag(tag=15) public Integer scheduleId = null;
}
