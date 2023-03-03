package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GameplayRecommendationElementReliquaryRequest.*;
import org.sorapointa.proto.GameplayRecommendationElementReliquaryRequest;
import org.sorapointa.proto.GameplayRecommendationReliquaryRequest.*;
import org.sorapointa.proto.GameplayRecommendationReliquaryRequest;
import org.sorapointa.proto.GameplayRecommendationSkillRequest.*;
import org.sorapointa.proto.GameplayRecommendationSkillRequest;

public class GetGameplayRecommendationReq {
    @Tag(tag=9) public Integer avatarId = null;
    @Tag(tag=553) public GameplayRecommendationSkillRequest skillRequest = null;
    @Tag(tag=1993) public GameplayRecommendationReliquaryRequest reliquaryRequest = null;
    @Tag(tag=1489) public GameplayRecommendationElementReliquaryRequest elementReliquaryRequest = null;
}
