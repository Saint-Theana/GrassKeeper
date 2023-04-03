package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.SceneRouteChangeInfo.*;
import org.sorapointa.proto.SceneRouteChangeInfo;

public class SceneRouteChangeNotify {
    public enum SceneRouteChangeNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=201) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer sceneId = null;
    @Tag(tag=12) public List<SceneRouteChangeInfo> routeList = new ArrayList<>();
    @Tag(tag=6) public Integer sceneTime = null;
}
