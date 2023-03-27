package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonObstacleInfo {
    @Tag(tag=3) public Vector center = null;
    @Tag(tag=5,isSigned=true) public Integer handleId = null;
    @Tag(tag=8) public RotationSpeed rotation = null;
    @Tag(tag=9) public Vector halfExtents = null;
    @Tag(tag=1) public Integer type = null;
}
