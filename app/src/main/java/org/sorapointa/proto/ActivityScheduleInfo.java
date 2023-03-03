package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityScheduleInfo {
    @Tag(tag=13) public Integer scheduleId = null;
    @Tag(tag=2) public Boolean isOpen = null;
    @Tag(tag=14) public Integer activityId = null;
    @Tag(tag=1) public Integer endTime = null;
    @Tag(tag=10) public Integer beginTime = null;
}
