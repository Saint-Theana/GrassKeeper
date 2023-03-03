package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TrialAvatarActivityRewardDetailInfo {
    @Tag(tag=2) public Boolean passedDungeon = null;
    @Tag(tag=4) public Integer trialAvatarIndexId = null;
    @Tag(tag=5) public Boolean receivedReward = null;
    @Tag(tag=7) public Integer rewardId = null;
}
