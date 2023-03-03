package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RoutePointChangeInfo.*;
import org.sorapointa.proto.RoutePointChangeInfo;

public class SceneRouteChangeInfo {
    @Tag(tag=12) public Boolean isForward = null;
    @Tag(tag=15) public Integer routeId = null;
    @Tag(tag=4) public Integer type = null;
    @Tag(tag=1) public List<RoutePointChangeInfo> pointList = new ArrayList<>();
}
