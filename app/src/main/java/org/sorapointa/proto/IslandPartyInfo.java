package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class IslandPartyInfo {
    @Tag(tag=5) public List<IslandPartyStageData> stageDataList = new ArrayList<>();
}
