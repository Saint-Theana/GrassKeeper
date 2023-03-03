package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeWatcherRewardReq {
    @Tag(tag=4) public Integer activityId = null;
    @Tag(tag=14) public Integer watcherId = null;
}
