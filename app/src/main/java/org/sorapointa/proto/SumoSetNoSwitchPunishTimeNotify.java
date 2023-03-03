package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoDungeonTeam.*;
import org.sorapointa.proto.SumoDungeonTeam;

public class SumoSetNoSwitchPunishTimeNotify {
    @Tag(tag=15) public Integer curTeamIndex = null;
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=11) public List<SumoDungeonTeam> dungeonTeamList = new ArrayList<>();
    @Tag(tag=2) public Integer noSwitchPunishTime = null;
    @Tag(tag=14) public Integer nextValidSwitchTime = null;
    @Tag(tag=9) public Integer activityId = null;
}
