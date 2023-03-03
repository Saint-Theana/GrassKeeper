package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.LanternRiteFireworksStageInfo.*;
import org.sorapointa.proto.LanternRiteFireworksStageInfo;

public class LanternRiteFireworksInfo {
    @Tag(tag=6) public List<LanternRiteFireworksStageInfo> stageInfoList = new ArrayList<>();
}
