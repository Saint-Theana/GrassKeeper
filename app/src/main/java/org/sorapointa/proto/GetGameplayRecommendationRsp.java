package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GameplayRecommendationElementReliquaryResponse.*;
import org.sorapointa.proto.GameplayRecommendationElementReliquaryResponse;
import org.sorapointa.proto.GameplayRecommendationReliquaryResponse.*;
import org.sorapointa.proto.GameplayRecommendationReliquaryResponse;
import org.sorapointa.proto.GameplayRecommendationSkillResponse.*;
import org.sorapointa.proto.GameplayRecommendationSkillResponse;

public class GetGameplayRecommendationRsp {
    @Tag(tag=6,isSigned=true) public Integer retcode = null;
    @Tag(tag=15) public Integer avatarId = null;
    @Tag(tag=1022) public GameplayRecommendationSkillResponse skillResponse = null;
    @Tag(tag=196) public GameplayRecommendationReliquaryResponse reliquaryResponse = null;
    @Tag(tag=167) public GameplayRecommendationElementReliquaryResponse elementReliquaryResponse = null;
}
