package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.InstableSprayTeamInfo.*;
import org.sorapointa.proto.InstableSprayTeamInfo;

public class InstableSprayStageInfo {
    @Tag(tag=2) public Integer maxScore = null;
    @Tag(tag=3) public List<InstableSprayTeamInfo> teamInfoList = new ArrayList<>();
    @Tag(tag=13) public Boolean isFinished = null;
    @Tag(tag=8) public Integer stageId = null;
}
