package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillUpgradeReq {
    public enum AvatarSkillUpgradeReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1029) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer avatarSkillId = null;
    @Tag(tag=2) public Long avatarGuid = null;
    @Tag(tag=12) public Integer oldLevel = null;
}
