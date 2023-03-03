package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MathQuaternion.*;
import org.sorapointa.proto.MathQuaternion;
import org.sorapointa.proto.MovingPlatformType.*;
import org.sorapointa.proto.MovingPlatformType;
import org.sorapointa.proto.Route.*;
import org.sorapointa.proto.Route;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class PlatformInfo {
    @Tag(tag=1) public Integer routeId = null;
    @Tag(tag=2,isSigned=true) public Integer startIndex = null;
    @Tag(tag=3) public Integer startRouteTime = null;
    @Tag(tag=4) public Integer startSceneTime = null;
    @Tag(tag=7) public Vector startPos = null;
    @Tag(tag=8) public Boolean isStarted = null;
    @Tag(tag=9) public MathQuaternion startRot = null;
    @Tag(tag=10) public Integer stopSceneTime = null;
    @Tag(tag=11) public Vector posOffset = null;
    @Tag(tag=12) public MathQuaternion rotOffset = null;
    @Tag(tag=13) public Integer movingPlatformType = null;
    @Tag(tag=14) public Boolean isActive = null;
    @Tag(tag=15) public Route route = null;
    @Tag(tag=16) public Integer pointId = null;
}
