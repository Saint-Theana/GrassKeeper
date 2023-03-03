package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RockBoardExploreStageData.*;
import org.sorapointa.proto.RockBoardExploreStageData;

public class RockBoardExploreDetailInfo {
    @Tag(tag=9) public List<RockBoardExploreStageData> stageDataList = new ArrayList<>();
}
