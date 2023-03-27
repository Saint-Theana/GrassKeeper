package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillMaxChargeCountNotify {
    public enum AvatarSkillMaxChargeCountNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1080) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer skillId = null;
    @Tag(tag=7) public Long avatarGuid = null;
    @Tag(tag=1) public Integer maxChargeCount = null;
}
