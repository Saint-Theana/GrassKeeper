package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarBuffDelNotify {
    public enum AvatarBuffDelNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=373) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=15) public Integer buffId = null;
    @Tag(tag=8) public Long avatarGuid = null;
}
