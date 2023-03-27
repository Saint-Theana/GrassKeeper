package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EnterTrialAvatarActivityDungeonReq {
    public enum EnterTrialAvatarActivityDungeonReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2167) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer activityId = null;
    @Tag(tag=13) public Integer enterPointId = null;
    @Tag(tag=4) public Integer trialAvatarIndexId = null;
}
