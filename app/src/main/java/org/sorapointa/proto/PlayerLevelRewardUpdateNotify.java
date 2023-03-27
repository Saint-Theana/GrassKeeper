package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class PlayerLevelRewardUpdateNotify {
    public enum PlayerLevelRewardUpdateNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=154) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<Integer> levelList = new ArrayList<>();
}
