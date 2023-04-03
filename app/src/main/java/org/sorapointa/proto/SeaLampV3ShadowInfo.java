package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SeaLampV3ShadowStageInfo.*;
import org.sorapointa.proto.SeaLampV3ShadowStageInfo;

public class SeaLampV3ShadowInfo {
    @Tag(tag=9) public List<SeaLampV3ShadowStageInfo> stageInfoList = new ArrayList<>();
}
