package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.TrialAvatarActivityRewardDetailInfo.*;
import org.sorapointa.proto.TrialAvatarActivityRewardDetailInfo;

public class TrialAvatarInfo {
    @Tag(tag=10) public List<TrialAvatarActivityRewardDetailInfo> rewardInfoList = new ArrayList<>();
}
