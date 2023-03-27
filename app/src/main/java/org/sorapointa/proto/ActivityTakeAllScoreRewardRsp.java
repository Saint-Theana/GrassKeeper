package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeAllScoreRewardRsp {
    public enum ActivityTakeAllScoreRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8501) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer activityId = null;
    @Tag(tag=7) public List<Integer> rewardConfigList = new ArrayList<>();
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
}
