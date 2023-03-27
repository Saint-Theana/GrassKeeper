package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarAddNotify {
    public enum AvatarAddNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1661) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public AvatarInfo avatar = null;
    @Tag(tag=14) public Boolean isInTeam = null;
}
