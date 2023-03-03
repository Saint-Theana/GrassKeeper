package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ScenePlayerInfo.*;
import org.sorapointa.proto.ScenePlayerInfo;

public class ScenePlayerInfoNotify {
    @Tag(tag=5) public List<ScenePlayerInfo> playerInfoList = new ArrayList<>();
}
