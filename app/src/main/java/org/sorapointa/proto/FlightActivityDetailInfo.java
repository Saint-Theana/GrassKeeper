package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FlightDailyRecord.*;
import org.sorapointa.proto.FlightDailyRecord;

public class FlightActivityDetailInfo {
    @Tag(tag=15) public Integer previewRewardId = null;
    @Tag(tag=11) public Integer minOpenPlayerLevel = null;
    @Tag(tag=1) public List<FlightDailyRecord> dailyRecordList = new ArrayList<>();
}
