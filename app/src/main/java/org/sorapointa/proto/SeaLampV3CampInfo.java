package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SeaLampV3CampInfo {
    @Tag(tag=12) public List<SeaLampV3CampStageInfo> stageInfoList = new ArrayList<>();
}
