package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ObstacleInfo.*;
import org.sorapointa.proto.ObstacleInfo;

public class ObstacleModifyNotify {
    @Tag(tag=9,isSigned=true) public List<Integer> removeObstacleIds = new ArrayList<>();
    @Tag(tag=6) public List<ObstacleInfo> addObstacles = new ArrayList<>();
    @Tag(tag=5) public Integer sceneId = null;
}
