package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SkillRequest.*;
import org.sorapointa.proto.SkillRequest;
import org.sorapointa.proto.ReliquaryRequest.*;
import org.sorapointa.proto.ReliquaryRequest;
import org.sorapointa.proto.ElementReliquaryRequest.*;
import org.sorapointa.proto.ElementReliquaryRequest;

public class GetGameplayRecommendationReq {
    public enum GetGameplayRecommendationReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=149) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public Integer avatarId = null;
    @Tag(tag=1689) public SkillRequest skillRequest = null;
    @Tag(tag=118) public ReliquaryRequest reliquaryRequest = null;
    @Tag(tag=1105) public ElementReliquaryRequest elementReliquaryRequest = null;
}
