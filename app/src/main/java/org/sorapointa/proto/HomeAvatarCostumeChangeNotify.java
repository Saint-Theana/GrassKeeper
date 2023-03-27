package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarCostumeChangeNotify {
    public enum HomeAvatarCostumeChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4523) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=7) public Integer avatarId = null;
    @Tag(tag=13) public Integer costumeId = null;
}
