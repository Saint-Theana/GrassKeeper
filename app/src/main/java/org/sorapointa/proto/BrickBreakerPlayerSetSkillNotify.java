package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerPlayerSetSkillNotify {
    public enum NLDNJKCEONN {
        @Tag(tag=0) None ,
        @Tag(tag=5333) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Integer uid = null;
    @Tag(tag=5) public List<Integer> skillIdList = new ArrayList<>();
}
