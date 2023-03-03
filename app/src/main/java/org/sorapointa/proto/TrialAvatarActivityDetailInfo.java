package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TrialAvatarActivityRewardDetailInfo.*;
import org.sorapointa.proto.TrialAvatarActivityRewardDetailInfo;

public class TrialAvatarActivityDetailInfo {
    @Tag(tag=13) public List<TrialAvatarActivityRewardDetailInfo> rewardInfoList = new ArrayList<>();
}
