package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ProudSkillExtraLevelNotify {
    public enum ProudSkillExtraLevelNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1013) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer talentIndex = null;
    @Tag(tag=2) public Long avatarGuid = null;
    @Tag(tag=5) public Integer talentType = null;
    @Tag(tag=13) public Integer extraLevel = null;
}
