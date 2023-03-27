package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ScenePlayerInfo {
    @Tag(tag=10) public String name = null;
    @Tag(tag=13) public Integer uid = null;
    @Tag(tag=5) public Integer peerId = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=7) public Boolean isConnected = null;
    @Tag(tag=2) public OnlinePlayerInfo onlinePlayerInfo = null;
}
