package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetGameplayRecommendationRsp {
    public enum GetGameplayRecommendationRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=196) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer avatarId = null;
    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=223) public SkillResponse skillResponse = null;
    @Tag(tag=1964) public ReliquaryResponse reliquaryResponse = null;
    @Tag(tag=1912) public ElementReliquaryResponse elementReliquaryResponse = null;
}
