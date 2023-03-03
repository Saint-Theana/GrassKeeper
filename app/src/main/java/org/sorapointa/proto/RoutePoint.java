package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MathQuaternion.*;
import org.sorapointa.proto.MathQuaternion;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class RoutePoint {
    @Tag(tag=1) public Vector position = null;
    @Tag(tag=2,isFloat=true) public Float arriveRange = null;
    @Tag(tag=3) public Boolean hasReachEvent = null;
    @Tag(tag=11,isFloat=true) public Float velocity = null;
    @Tag(tag=12,isFloat=true) public Float time = null;
    @Tag(tag=21) public Vector rotation = null;
    @Tag(tag=22) public MathQuaternion rotationSpeed = null;
    @Tag(tag=23) public MathQuaternion axisSpeed = null;
}
