package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MistTrialMissionInfo.*;
import org.sorapointa.proto.MistTrialMissionInfo;

public class MistTrialGetChallengeMissionRsp {
    public enum MistTrialGetChallengeMissionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8884) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7,isSigned=true) public Integer retcode = null;
    @Tag(tag=9) public Integer trialId = null;
    @Tag(tag=6) public List<MistTrialMissionInfo> missionInfoList = new ArrayList<>();
}
