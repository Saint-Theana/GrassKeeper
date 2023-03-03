package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.PlayerWidgetInfo.*;
import org.sorapointa.proto.PlayerWidgetInfo;

public class RemotePlayerWidgetNotify {
    @Tag(tag=3) public List<PlayerWidgetInfo> playerWidgetInfoList = new ArrayList<>();
}
