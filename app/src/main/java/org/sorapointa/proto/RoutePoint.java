package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class RoutePoint {
    @Tag(tag=1) public Vector position = null;
    @Tag(tag=2,isFloat=true) public Float arriveRange = null;
    @Tag(tag=3) public Boolean hasReachEvent = null;
    @Tag(tag=11,isFloat=true) public Float velocity = null;
    @Tag(tag=12,isFloat=true) public Float time = null;
    @Tag(tag=21) public Vector rotation = null;
    @Tag(tag=22) public RotationSpeed rotationSpeed = null;
    @Tag(tag=23) public RotationSpeed axisSpeed = null;
}
