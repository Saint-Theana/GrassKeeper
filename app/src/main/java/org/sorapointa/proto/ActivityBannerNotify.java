package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityBannerNotify {
    @Tag(tag=1) public Integer scheduleId = null;
    @Tag(tag=3) public Integer activityId = null;
}
