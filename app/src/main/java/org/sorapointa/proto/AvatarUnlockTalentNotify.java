package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarUnlockTalentNotify {
    public enum AvatarUnlockTalentNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1087) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12) public Long avatarGuid = null;
    @Tag(tag=10) public Integer talentId = null;
    @Tag(tag=15) public Integer skillDepotId = null;
    @Tag(tag=14) public Integer entityId = null;
}
