package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoTeamData.*;
import org.sorapointa.proto.SumoTeamData;

public class SumoStageData {
    @Tag(tag=1) public Integer maxScore = null;
    @Tag(tag=5) public Integer openTime = null;
    @Tag(tag=3) public Integer stageId = null;
    @Tag(tag=7) public List<SumoTeamData> teamList = new ArrayList<>();
    @Tag(tag=11) public Boolean isOpen = null;
}
