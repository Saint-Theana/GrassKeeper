package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SeaLampV3ShadowLevelInfo.*;
import org.sorapointa.proto.SeaLampV3ShadowLevelInfo;

public class SeaLampV3ShadowStageInfo {
    @Tag(tag=5) public Integer stageId = null;
    @Tag(tag=4) public List<SeaLampV3ShadowLevelInfo> levelInfoList = new ArrayList<>();
    @Tag(tag=11) public Boolean isOpen = null;
}
