package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionWatcherInfo {
    @Tag(tag=12) public Integer rewardUnlockTime = null;
    @Tag(tag=3) public Integer watcherId = null;
    @Tag(tag=4) public Integer totalProgress = null;
    @Tag(tag=11) public Integer curProgress = null;
    @Tag(tag=14) public Boolean isTakenReward = null;
}
