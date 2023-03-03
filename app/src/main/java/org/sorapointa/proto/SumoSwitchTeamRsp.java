package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoDungeonTeam.*;
import org.sorapointa.proto.SumoDungeonTeam;

public class SumoSwitchTeamRsp {
    @Tag(tag=7) public Integer nextValidSwitchTime = null;
    @Tag(tag=10) public List<SumoDungeonTeam> dungeonTeamList = new ArrayList<>();
    @Tag(tag=6) public Integer activityId = null;
    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer curTeamIndex = null;
    @Tag(tag=5) public Integer stageId = null;
}
