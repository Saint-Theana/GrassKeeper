package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ReceivedTrialAvatarActivityRewardRsp {
    @Tag(tag=13) public Integer activityId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer trialAvatarIndexId = null;
}
