package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ObstacleInfo.*;
import org.sorapointa.proto.ObstacleInfo;

public class PathfindingEnterSceneReq {
    public enum PathfindingEnterSceneReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2320) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<Integer> activityId = new ArrayList<>();
    @Tag(tag=1) public Integer sceneTagHash = null;
    @Tag(tag=11) public Integer sceneId = null;
    @Tag(tag=13) public Boolean isEditor = null;
    @Tag(tag=6) public Integer version = null;
    @Tag(tag=3) public Integer polygonId = null;
    @Tag(tag=10) public List<ObstacleInfo> obstacles = new ArrayList<>();
}
