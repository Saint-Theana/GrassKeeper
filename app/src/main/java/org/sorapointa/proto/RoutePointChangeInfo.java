package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoutePointChangeInfo {
    @Tag(tag=7,isFloat=true) public Float targetVelocity = null;
    @Tag(tag=11) public Integer pointIndex = null;
    @Tag(tag=15,isFloat=true) public Float waitTime = null;
}
