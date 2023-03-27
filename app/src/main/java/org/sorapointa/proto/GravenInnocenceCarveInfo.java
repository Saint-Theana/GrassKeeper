package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GravenInnocenceCarveInfo {
    @Tag(tag=12) public List<Integer> hasEditConfigIdList = new ArrayList<>();
    @Tag(tag=15) public Integer canEditCount = null;
    @Tag(tag=4) public List<GravenInnocenceCarveStageInfo> stageInfoList = new ArrayList<>();
}
