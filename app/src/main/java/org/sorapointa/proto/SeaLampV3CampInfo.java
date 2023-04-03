package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SeaLampV3CampStageInfo.*;
import org.sorapointa.proto.SeaLampV3CampStageInfo;

public class SeaLampV3CampInfo {
    @Tag(tag=12) public List<SeaLampV3CampStageInfo> stageInfoList = new ArrayList<>();
}
