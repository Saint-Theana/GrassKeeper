package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeScoreRewardReq {
    @Tag(tag=12) public Integer rewardConfigId = null;
    @Tag(tag=9) public Integer activityId = null;
}
