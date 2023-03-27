package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneRouteChangeInfo {
    @Tag(tag=7) public Boolean isForward = null;
    @Tag(tag=14) public List<RoutePointChangeInfo> pointList = new ArrayList<>();
    @Tag(tag=11) public Integer type = null;
    @Tag(tag=6) public Integer routeId = null;
}
