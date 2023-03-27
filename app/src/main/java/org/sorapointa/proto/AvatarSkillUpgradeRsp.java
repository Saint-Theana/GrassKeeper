package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillUpgradeRsp {
    public enum AvatarSkillUpgradeRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1078) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=2) public Integer curLevel = null;
    @Tag(tag=15) public Integer avatarSkillId = null;
    @Tag(tag=7) public Long avatarGuid = null;
    @Tag(tag=1) public Integer oldLevel = null;
}
