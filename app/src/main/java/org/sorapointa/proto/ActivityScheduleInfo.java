package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityScheduleInfo {
    @Tag(tag=12) public Integer activityId = null;
    @Tag(tag=13) public Integer scheduleId = null;
    @Tag(tag=2) public Integer beginTime = null;
    @Tag(tag=9) public Integer endTime = null;
    @Tag(tag=7) public Boolean isOpen = null;
}
