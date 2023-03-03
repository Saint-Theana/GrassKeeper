package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ToTheMoonObstacleInfo.*;
import org.sorapointa.proto.ToTheMoonObstacleInfo;

public class ToTheMoonObstaclesModifyNotify {
    @Tag(tag=4) public List<ToTheMoonObstacleInfo> addObstacles = new ArrayList<>();
    @Tag(tag=13,isSigned=true) public List<Integer> removeObstacleIds = new ArrayList<>();
    @Tag(tag=15) public Integer sceneId = null;
    @Tag(tag=1) public Boolean useEdge = null;
}
