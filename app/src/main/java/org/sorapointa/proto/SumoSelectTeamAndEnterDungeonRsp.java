package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoSelectTeamAndEnterDungeonRsp {
    @Tag(tag=1,isSigned=true) public Integer retcode = null;
    @Tag(tag=14) public Integer activityId = null;
    @Tag(tag=12) public Integer difficultyId = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=2) public List<SumoTeamData> teamList = new ArrayList<>();
}
