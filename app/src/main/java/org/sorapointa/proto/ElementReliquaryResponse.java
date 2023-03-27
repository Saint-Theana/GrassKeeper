package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ElementReliquaryResponse {
    @Tag(tag=4) public Integer elementType = null;
    @Tag(tag=3) public List<GameplayRecommendationReliquaryMainPropData> mainPropDataList = new ArrayList<>();
    @Tag(tag=7) public Integer equipType = null;
}
