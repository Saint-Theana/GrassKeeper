package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoDungeonTeam.*;
import org.sorapointa.proto.SumoDungeonTeam;

public class SumoSetNoSwitchPunishTimeNotify {
    public enum SumoSetNoSwitchPunishTimeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8554) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=11) public Integer nextValidSwitchTime = null;
    @Tag(tag=3) public List<SumoDungeonTeam> dungeonTeamList = new ArrayList<>();
    @Tag(tag=14) public Integer noSwitchPunishTime = null;
    @Tag(tag=1) public Integer stageId = null;
    @Tag(tag=7) public Integer activityId = null;
    @Tag(tag=2) public Integer curTeamIndex = null;
}
