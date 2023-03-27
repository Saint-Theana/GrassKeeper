package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionSignInRewardReq {
    public enum TakeReunionSignInRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5081) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=2) public Integer rewardDay = null;
    @Tag(tag=3) public Integer configId = null;
}
