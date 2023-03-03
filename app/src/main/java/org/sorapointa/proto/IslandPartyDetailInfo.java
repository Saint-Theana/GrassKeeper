package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.IslandPartyStageData.*;
import org.sorapointa.proto.IslandPartyStageData;

public class IslandPartyDetailInfo {
    @Tag(tag=15) public List<IslandPartyStageData> stageDataList = new ArrayList<>();
}
