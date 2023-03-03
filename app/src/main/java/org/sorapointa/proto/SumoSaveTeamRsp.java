package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoSaveTeamRsp {
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=2,isSigned=true) public Integer retcode = null;
    @Tag(tag=11) public Integer activityId = null;
    @Tag(tag=13) public List<SumoTeamData> teamList = new ArrayList<>();
    @Tag(tag=10) public Integer difficultyId = null;
}
