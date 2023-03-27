package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillChangeNotify {
    public enum ProudSkillChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1024) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Integer entityId = null;
    @Tag(tag=6) public Long avatarGuid = null;
    @Tag(tag=10) public List<Integer> proudSkillList = new ArrayList<>();
    @Tag(tag=15) public Integer skillDepotId = null;
}
