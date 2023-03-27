package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MaterialDeleteInfo {
    public static class MaterialDeleteInfo_CountDownDelete {
        public static class MapDeleteTimeNumMap {
            @Tag(tag=1) public Integer key = null;
            @Tag(tag=2) public Integer value = null;
        }

        @Tag(tag=1) public List<MapDeleteTimeNumMap> deleteTimeNumMap = new ArrayList<>();
        @Tag(tag=2) public Integer configCountDownTime = null;
    }

    public static class MaterialDeleteInfo_DateTimeDelete {
        @Tag(tag=1) public Integer deleteTime = null;
    }

    public static class MaterialDeleteInfo_DelayWeekCountDownDelete {
        public static class MapDeleteTimeNumMap {
            @Tag(tag=1) public Integer key = null;
            @Tag(tag=2) public Integer value = null;
        }

        @Tag(tag=1) public List<MapDeleteTimeNumMap> deleteTimeNumMap = new ArrayList<>();
        @Tag(tag=2) public Integer configDelayWeek = null;
        @Tag(tag=3) public Integer configCountDownTime = null;
    }

    @Tag(tag=1) public Boolean hasDeleteConfig = null;
    @Tag(tag=2) public MaterialDeleteInfo_CountDownDelete countDownDelete = null;
    @Tag(tag=3) public MaterialDeleteInfo_DateTimeDelete dateDelete = null;
    @Tag(tag=4) public MaterialDeleteInfo_DelayWeekCountDownDelete delayWeekCountDownDelete = null;
}
