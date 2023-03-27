package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ObstacleInfo {
    @Tag(tag=4) public Vector center = null;
    @Tag(tag=12) public Vector3Int extents = null;
    @Tag(tag=5) public Integer shape = null;
    @Tag(tag=9,isSigned=true) public Integer obstacleId = null;
    @Tag(tag=2) public RotationSpeed rotation = null;
}
