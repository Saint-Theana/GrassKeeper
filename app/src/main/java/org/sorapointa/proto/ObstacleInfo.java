package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MathQuaternion.*;
import org.sorapointa.proto.MathQuaternion;
import org.sorapointa.proto.Vector.*;
import org.sorapointa.proto.Vector;
import org.sorapointa.proto.Vector3Int.*;
import org.sorapointa.proto.Vector3Int;

public class ObstacleInfo {
    public enum ShapeType {
        @Tag(tag=0) SHAPE_TYPE_OBSTACLE_SHAPE_CAPSULE ,
        @Tag(tag=1) SHAPE_TYPE_OBSTACLE_SHAPE_BOX ;
    }

    @Tag(tag=4) public MathQuaternion rotation = null;
    @Tag(tag=2,isSigned=true) public Integer obstacleId = null;
    @Tag(tag=14) public Vector center = null;
    @Tag(tag=6) public ShapeType shape = null;
    @Tag(tag=12) public Vector3Int extents = null;
}
