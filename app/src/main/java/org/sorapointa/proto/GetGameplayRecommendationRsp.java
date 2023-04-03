package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SkillResponse.*;
import org.sorapointa.proto.SkillResponse;
import org.sorapointa.proto.ReliquaryResponse.*;
import org.sorapointa.proto.ReliquaryResponse;
import org.sorapointa.proto.ElementReliquaryResponse.*;
import org.sorapointa.proto.ElementReliquaryResponse;

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
