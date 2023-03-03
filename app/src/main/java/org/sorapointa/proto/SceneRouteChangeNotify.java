package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneRouteChangeInfo.*;
import org.sorapointa.proto.SceneRouteChangeInfo;

public class SceneRouteChangeNotify {
    @Tag(tag=12) public Integer sceneId = null;
    @Tag(tag=11) public Integer sceneTime = null;
    @Tag(tag=2) public List<SceneRouteChangeInfo> routeList = new ArrayList<>();
}
