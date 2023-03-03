package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ObstacleInfo.*;
import org.sorapointa.proto.ObstacleInfo;

public class PathfindingEnterSceneReq {
    @Tag(tag=12) public Integer sceneId = null;
    @Tag(tag=14) public List<Integer> activityId = new ArrayList<>();
    @Tag(tag=15) public Integer sceneTagHash = null;
    @Tag(tag=6) public Integer version = null;
    @Tag(tag=11) public Boolean isEditor = null;
    @Tag(tag=13) public List<ObstacleInfo> obstacles = new ArrayList<>();
    @Tag(tag=4) public Integer polygonId = null;
}
