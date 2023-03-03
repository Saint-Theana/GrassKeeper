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

public class GMObstacleInfo {
    public enum ShapeType {
        @Tag(tag=0) OBSTACLE_SHAPE_CAPSULE ,
        @Tag(tag=1) OBSTACLE_SHAPE_BOX ;
    }

    @Tag(tag=14,isSigned=true) public Long timestamp = null;
    @Tag(tag=2) public ShapeType shape = null;
    @Tag(tag=13,isSigned=true) public Integer obstacleId = null;
    @Tag(tag=3) public MathQuaternion rotation = null;
    @Tag(tag=8) public Vector center = null;
    @Tag(tag=15) public Vector3Int extents = null;
}
