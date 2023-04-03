package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RoutePoint.*;
import org.sorapointa.proto.RoutePoint;

public class MonsterRoute {
    @Tag(tag=1) public List<RoutePoint> routePoints = new ArrayList<>();
    @Tag(tag=2) public Integer speedLevel = null;
    @Tag(tag=3) public Integer routeType = null;
    @Tag(tag=4,isFloat=true) public Float arriveRange = null;
}
