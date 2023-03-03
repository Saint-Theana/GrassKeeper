package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SummerTimeSprintBoatRecord {
    @Tag(tag=3) public Integer bestScore = null;
    @Tag(tag=13) public Integer startTime = null;
    @Tag(tag=7) public Boolean isTouched = null;
    @Tag(tag=10) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=2) public Integer groupId = null;
}
