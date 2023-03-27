package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarSkillChangeNotify {
    public enum AvatarSkillChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1016) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Long avatarGuid = null;
    @Tag(tag=12) public Integer entityId = null;
    @Tag(tag=1) public Integer avatarSkillId = null;
    @Tag(tag=5) public Integer skillDepotId = null;
    @Tag(tag=6) public Integer oldLevel = null;
    @Tag(tag=2) public Integer curLevel = null;
}
