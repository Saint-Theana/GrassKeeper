package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GameplayRecommendationReliquaryMainPropData.*;
import org.sorapointa.proto.GameplayRecommendationReliquaryMainPropData;

public class GameplayRecommendationReliquaryResponse {
    @Tag(tag=8) public List<GameplayRecommendationReliquaryMainPropData> mainPropDataList = new ArrayList<>();
    @Tag(tag=3) public Integer equipType = null;
}
