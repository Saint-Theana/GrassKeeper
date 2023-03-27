package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SingleStartBrickBreakerReq {
    public enum FOGKEKLDMHI {
        @Tag(tag=0) None ,
        @Tag(tag=23861) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=1) public Integer levelId = null;
    @Tag(tag=15) public Boolean isDungeon = null;
    @Tag(tag=12) public List<Integer> chosenSkillList = new ArrayList<>();
    @Tag(tag=10) public List<Integer> chosenAvatarList = new ArrayList<>();
}
