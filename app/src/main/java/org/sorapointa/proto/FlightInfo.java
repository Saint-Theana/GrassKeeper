package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightInfo {
    @Tag(tag=5) public List<FlightDailyRecord> dailyRecordList = new ArrayList<>();
    @Tag(tag=2) public Integer minOpenPlayerLevel = null;
    @Tag(tag=7) public Integer previewRewardId = null;
}
