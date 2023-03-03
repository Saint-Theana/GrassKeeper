package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GravenInnocenceCampStageInfo.*;
import org.sorapointa.proto.GravenInnocenceCampStageInfo;

public class GravenInnocenceCampInfo {
    @Tag(tag=5) public List<GravenInnocenceCampStageInfo> stageInfoList = new ArrayList<>();
}
