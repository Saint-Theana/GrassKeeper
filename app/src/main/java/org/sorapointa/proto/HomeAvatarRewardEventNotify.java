package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeAvatarRewardEventInfo.*;
import org.sorapointa.proto.HomeAvatarRewardEventInfo;

public class HomeAvatarRewardEventNotify {
    public enum HomeAvatarRewardEventNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4461) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Boolean isEventTrigger = null;
    @Tag(tag=12) public HomeAvatarRewardEventInfo rewardEvent = null;
    @Tag(tag=15) public List<HomeAvatarRewardEventInfo> pendingList = new ArrayList<>();
}
