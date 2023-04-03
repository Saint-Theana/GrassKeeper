package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;
import org.sorapointa.proto.PlayerWidgetInfo.*;
import org.sorapointa.proto.PlayerWidgetInfo;

public class WorldPlayerInfoNotify {
    public enum WorldPlayerInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3125) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public List<Integer> playerUidList = new ArrayList<>();
    @Tag(tag=12) public List<OnlinePlayerInfo> playerInfoList = new ArrayList<>();
    @Tag(tag=1) public List<PlayerWidgetInfo> playerWidgetInfoList = new ArrayList<>();
}
