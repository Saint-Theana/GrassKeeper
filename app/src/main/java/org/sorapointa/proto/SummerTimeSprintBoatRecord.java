package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatRecord {
    @Tag(tag=5) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=3) public Integer startTime = null;
    @Tag(tag=9) public Boolean isTouched = null;
    @Tag(tag=2) public Integer bestScore = null;
    @Tag(tag=14) public Integer groupId = null;
}
