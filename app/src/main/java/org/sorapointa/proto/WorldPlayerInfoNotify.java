package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;
import org.sorapointa.proto.PlayerWidgetInfo.*;
import org.sorapointa.proto.PlayerWidgetInfo;

public class WorldPlayerInfoNotify {
    @Tag(tag=8) public List<PlayerWidgetInfo> playerWidgetInfoList = new ArrayList<>();
    @Tag(tag=14) public List<OnlinePlayerInfo> playerInfoList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> playerUidList = new ArrayList<>();
}
