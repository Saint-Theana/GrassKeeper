package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class TakeReunionMissionRewardRsp {
    public enum TakeReunionMissionRewardRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5092) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=12) public ReunionMissionInfo missionInfo = null;
    @Tag(tag=5) public Integer rewardIndex = null;
    @Tag(tag=4,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer rewardId = null;
}
