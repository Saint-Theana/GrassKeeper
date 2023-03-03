package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoSaveTeamReq {
    @Tag(tag=11) public Integer activityId = null;
    @Tag(tag=13) public Integer stageId = null;
    @Tag(tag=7) public Integer difficultyId = null;
    @Tag(tag=12) public List<SumoTeamData> teamList = new ArrayList<>();
}
