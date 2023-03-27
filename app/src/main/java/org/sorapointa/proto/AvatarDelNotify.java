package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarDelNotify {
    public enum AvatarDelNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1670) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public List<Long> avatarGuidList = new ArrayList<>();
}
