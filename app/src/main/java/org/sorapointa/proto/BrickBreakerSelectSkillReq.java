package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class BrickBreakerSelectSkillReq {
    public enum JHOENKPNEGJ {
        @Tag(tag=0) None ,
        @Tag(tag=5319) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public List<Integer> skillId = new ArrayList<>();
}
