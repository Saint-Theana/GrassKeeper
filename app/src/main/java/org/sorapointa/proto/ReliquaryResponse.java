package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GameplayRecommendationReliquaryMainPropData.*;
import org.sorapointa.proto.GameplayRecommendationReliquaryMainPropData;

public class ReliquaryResponse {
    @Tag(tag=12) public List<GameplayRecommendationReliquaryMainPropData> mainPropDataList = new ArrayList<>();
    @Tag(tag=15) public Integer equipType = null;
}
