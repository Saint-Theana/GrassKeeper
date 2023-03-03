package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeWatcherRewardBatchReq {
    @Tag(tag=11) public List<Integer> watcherIdList = new ArrayList<>();
    @Tag(tag=3) public Integer activityId = null;
}
