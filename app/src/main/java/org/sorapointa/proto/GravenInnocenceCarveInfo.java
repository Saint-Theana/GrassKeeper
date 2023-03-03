package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GravenInnocenceCarveStageInfo.*;
import org.sorapointa.proto.GravenInnocenceCarveStageInfo;

public class GravenInnocenceCarveInfo {
    @Tag(tag=10) public List<GravenInnocenceCarveStageInfo> stageInfoList = new ArrayList<>();
    @Tag(tag=7) public Integer canEditCount = null;
    @Tag(tag=6) public List<Integer> hasEditConfigIdList = new ArrayList<>();
}
