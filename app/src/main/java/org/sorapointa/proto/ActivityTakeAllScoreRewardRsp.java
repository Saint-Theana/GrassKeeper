package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeAllScoreRewardRsp {
    @Tag(tag=14) public List<Integer> rewardConfigList = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer activityId = null;
}
