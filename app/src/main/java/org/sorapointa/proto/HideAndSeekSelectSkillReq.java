package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekSelectSkillReq {
    public enum HideAndSeekSelectSkillReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8142) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public List<Integer> skillList = new ArrayList<>();
}
