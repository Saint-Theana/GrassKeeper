package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CoopReward.*;
import org.sorapointa.proto.CoopReward;

public class CoopRewardUpdateNotify {
    @Tag(tag=7) public List<CoopReward> rewardList = new ArrayList<>();
}
