package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarBuffAddNotify {
    public enum AvatarBuffAddNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=328) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer buffId = null;
    @Tag(tag=7) public Long avatarGuid = null;
}
