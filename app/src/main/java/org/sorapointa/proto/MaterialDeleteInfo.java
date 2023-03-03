package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MaterialDeleteInfo {
    public static class CountDownDelete {
        public static class MapDeleteTimeNumMap {
            @Tag(tag=1) public Integer key = null;
            @Tag(tag=2) public Integer value = null;
        }

        @Tag(tag=1) public List<MapDeleteTimeNumMap> deleteTimeNumMap = new ArrayList<>();
        @Tag(tag=2) public Integer configCountDownTime = null;
    }

    public static class DateTimeDelete {
        @Tag(tag=1) public Integer deleteTime = null;
    }

    public static class DelayWeekCountDownDelete {
        public static class MapDeleteTimeNumMap {
            @Tag(tag=1) public Integer key = null;
            @Tag(tag=2) public Integer value = null;
        }

        @Tag(tag=1) public List<MapDeleteTimeNumMap> deleteTimeNumMap = new ArrayList<>();
        @Tag(tag=2) public Integer configDelayWeek = null;
        @Tag(tag=3) public Integer configCountDownTime = null;
    }

    @Tag(tag=1) public Boolean hasDeleteConfig = null;
    @Tag(tag=2) public CountDownDelete countDownDelete = null;
    @Tag(tag=3) public DateTimeDelete dateDelete = null;
    @Tag(tag=4) public DelayWeekCountDownDelete delayWeekCountDownDelete = null;
}
