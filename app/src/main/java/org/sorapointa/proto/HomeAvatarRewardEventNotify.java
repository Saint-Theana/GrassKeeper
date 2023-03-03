package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.HomeAvatarRewardEventInfo.*;
import org.sorapointa.proto.HomeAvatarRewardEventInfo;

public class HomeAvatarRewardEventNotify {
    @Tag(tag=4) public Boolean isEventTrigger = null;
    @Tag(tag=2) public HomeAvatarRewardEventInfo rewardEvent = null;
    @Tag(tag=8) public List<HomeAvatarRewardEventInfo> pendingList = new ArrayList<>();
}
