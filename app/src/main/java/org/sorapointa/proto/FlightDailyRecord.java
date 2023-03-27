package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FlightDailyRecord {
    @Tag(tag=14) public Integer groupId = null;
    @Tag(tag=15) public Integer startTime = null;
    @Tag(tag=6) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=8) public Boolean isTouched = null;
    @Tag(tag=3) public Integer bestScore = null;
}
