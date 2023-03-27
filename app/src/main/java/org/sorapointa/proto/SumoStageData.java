package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SumoStageData {
    @Tag(tag=5) public Integer maxScore = null;
    @Tag(tag=9) public Integer stageId = null;
    @Tag(tag=14) public Integer openTime = null;
    @Tag(tag=13) public List<SumoTeamData> teamList = new ArrayList<>();
    @Tag(tag=15) public Boolean isOpen = null;
}
