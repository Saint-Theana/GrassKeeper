package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityBannerClearReq {
    @Tag(tag=15) public Integer scheduleId = null;
    @Tag(tag=12) public Integer activityId = null;
}
