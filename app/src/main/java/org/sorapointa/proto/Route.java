package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class Route {
    @Tag(tag=1) public List<RoutePoint> routePoints = new ArrayList<>();
    @Tag(tag=2) public Integer routeType = null;
}
