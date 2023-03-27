package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerSelectSkillRsp {
    public enum PEKBCBCGBAM {
        @Tag(tag=0) None ,
        @Tag(tag=5321) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=6) public List<Integer> skillId = new ArrayList<>();
    @Tag(tag=9,isSigned=true) public Integer retcode = null;
}
