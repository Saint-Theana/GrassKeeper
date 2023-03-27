package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ActivityTakeScoreRewardRsp {
    public enum ActivityTakeScoreRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8946) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=13) public Integer rewardConfigId = null;
    @Tag(tag=14) public Integer activityId = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
}
