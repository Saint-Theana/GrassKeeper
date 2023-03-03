package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MistTrialMissionInfo.*;
import org.sorapointa.proto.MistTrialMissionInfo;

public class MistTrialGetChallengeMissionRsp {
    @Tag(tag=1) public Integer trialId = null;
    @Tag(tag=15) public List<MistTrialMissionInfo> missionInfoList = new ArrayList<>();
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
