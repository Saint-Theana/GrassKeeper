package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoDungeonTeam.*;
import org.sorapointa.proto.SumoDungeonTeam;

public class SumoSwitchTeamRsp {
    public enum SumoSwitchTeamRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8137) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer nextValidSwitchTime = null;
    @Tag(tag=7) public Integer activityId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=8) public Integer stageId = null;
    @Tag(tag=13) public Integer curTeamIndex = null;
    @Tag(tag=5) public List<SumoDungeonTeam> dungeonTeamList = new ArrayList<>();
}
