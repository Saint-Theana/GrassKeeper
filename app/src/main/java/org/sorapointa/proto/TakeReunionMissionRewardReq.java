package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionMissionRewardReq {
    public enum TakeReunionMissionRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5064) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer missionId = null;
    @Tag(tag=15) public Integer rewardIndex = null;
    @Tag(tag=7) public Integer rewardId = null;
}
