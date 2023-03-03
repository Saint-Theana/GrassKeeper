package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SumoStageData.*;
import org.sorapointa.proto.SumoStageData;

public class SumoActivityDetailInfo {
    public static class MapSumoStageMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public SumoStageData value = null;
    }

    @Tag(tag=11) public Integer difficultyId = null;
    @Tag(tag=13) public List<MapSumoStageMap> sumoStageMap = new ArrayList<>();
    @Tag(tag=14) public Integer lastStageId = null;
}
