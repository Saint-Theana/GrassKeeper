package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReunionWatcherInfo {
    @Tag(tag=7) public Integer rewardUnlockTime = null;
    @Tag(tag=11) public Integer curProgress = null;
    @Tag(tag=12) public Integer watcherId = null;
    @Tag(tag=10) public Integer totalProgress = null;
    @Tag(tag=5) public Boolean isTakenReward = null;
}
