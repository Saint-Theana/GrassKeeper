package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightDailyRecord {
    @Tag(tag=4) public Integer groupId = null;
    @Tag(tag=1) public Boolean isTouched = null;
    @Tag(tag=11) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=7) public Integer bestScore = null;
    @Tag(tag=3) public Integer startTime = null;
}
