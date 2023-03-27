package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class AvatarFlycloakChangeNotify {
    public enum AvatarFlycloakChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=1626) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer flycloakId = null;
    @Tag(tag=12) public Long avatarGuid = null;
}
