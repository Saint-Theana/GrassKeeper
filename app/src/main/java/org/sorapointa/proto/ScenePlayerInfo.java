package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class ScenePlayerInfo {
    @Tag(tag=10) public Integer sceneId = null;
    @Tag(tag=6) public Integer peerId = null;
    @Tag(tag=13) public OnlinePlayerInfo onlinePlayerInfo = null;
    @Tag(tag=2) public Boolean isConnected = null;
    @Tag(tag=15) public String name = null;
    @Tag(tag=8) public Integer uid = null;
}
