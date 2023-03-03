package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityReadPushTipsReq {
    @Tag(tag=14) public List<Integer> activityPushTipsIdList = new ArrayList<>();
    @Tag(tag=7) public Integer activityId = null;
}
