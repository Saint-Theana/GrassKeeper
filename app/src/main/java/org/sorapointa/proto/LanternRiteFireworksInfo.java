package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class LanternRiteFireworksInfo {
    @Tag(tag=1) public List<LanternRiteFireworksStageInfo> stageInfoList = new ArrayList<>();
}
