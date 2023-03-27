package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class HomeAvatarSummonAllEventNotify {
    public enum HomeAvatarSummonAllEventNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4579) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<HomeAvatarSummonEventInfo> summonEventList = new ArrayList<>();
}
