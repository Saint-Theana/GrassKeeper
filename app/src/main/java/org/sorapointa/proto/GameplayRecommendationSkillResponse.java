package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GameplayRecommendationSkillResponse {
    @Tag(tag=13) public Integer skillDepotId = null;
    @Tag(tag=9) public List<Integer> skillIdList = new ArrayList<>();
}
