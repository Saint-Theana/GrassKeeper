package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayTeamInfo.*;
import org.sorapointa.proto.InstableSprayTeamInfo;

public class InstableSprayStageInfo {
    @Tag(tag=10) public Boolean isFinished = null;
    @Tag(tag=3) public Integer maxScore = null;
    @Tag(tag=4) public Integer stageId = null;
    @Tag(tag=6) public List<InstableSprayTeamInfo> teamInfoList = new ArrayList<>();
}
