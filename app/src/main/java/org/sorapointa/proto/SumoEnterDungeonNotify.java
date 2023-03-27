package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoEnterDungeonNotify {
    public enum SumoEnterDungeonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8559) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer nextValidSwitchTime = null;
    @Tag(tag=6) public Integer activityId = null;
    @Tag(tag=15) public Integer stageId = null;
    @Tag(tag=7) public Integer noSwitchPunishTime = null;
    @Tag(tag=14) public Integer curTeamIndex = null;
    @Tag(tag=1) public List<SumoDungeonTeam> dungeonTeamList = new ArrayList<>();
}
