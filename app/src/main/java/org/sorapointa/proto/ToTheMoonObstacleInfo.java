package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MathQuaternion.*;
import org.sorapointa.proto.MathQuaternion;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;

public class ToTheMoonObstacleInfo {
    public enum ShapeType {
        @Tag(tag=0) SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE ,
        @Tag(tag=1) SHAPE_TYPE_OBSTACLE_SHAPE_BOX ;
    }

    @Tag(tag=2) public ShapeType type = null;
    @Tag(tag=11,isSigned=true) public Integer handleId = null;
    @Tag(tag=7) public MathQuaternion rotation = null;
    @Tag(tag=13) public Vector center = null;
    @Tag(tag=14) public Vector halfExtents = null;
}
