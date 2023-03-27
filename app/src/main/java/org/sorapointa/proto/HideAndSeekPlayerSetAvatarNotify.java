package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HideAndSeekPlayerSetAvatarNotify {
    public enum HideAndSeekPlayerSetAvatarNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=5323) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer costumeId = null;
    @Tag(tag=2) public Integer uid = null;
    @Tag(tag=10) public Integer avatarId = null;
}
