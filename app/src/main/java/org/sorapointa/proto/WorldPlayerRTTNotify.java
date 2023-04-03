package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerRTTInfo.*;
import org.sorapointa.proto.PlayerRTTInfo;

public class WorldPlayerRTTNotify {
    public enum WorldPlayerRTTNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=92) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public List<PlayerRTTInfo> playerRttList = new ArrayList<>();
}
