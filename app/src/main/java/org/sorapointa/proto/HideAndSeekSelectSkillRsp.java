package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekSelectSkillRsp {
    public enum HideAndSeekSelectSkillRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8442) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<Integer> skillList = new ArrayList<>();
}
