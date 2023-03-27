package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarEquipAffixStartNotify {
    public enum AvatarEquipAffixStartNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1602) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public AvatarEquipAffixInfo equipAffixInfo = null;
    @Tag(tag=15) public Long avatarGuid = null;
}
