package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonRemoveObstacleReq {
    public enum ObstacleType {
        @Tag(tag=0) OBSTACLE_TYPE_BOX ,
        @Tag(tag=1) OBSTACLE_TYPE_CAPSULE ;
    }

    @Tag(tag=12,isSigned=true) public Integer handle = null;
    @Tag(tag=10) public Integer sceneId = null;
    @Tag(tag=11,isSigned=true) public Integer queryId = null;
}
