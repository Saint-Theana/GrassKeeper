package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ObstacleModifyNotify {
    public enum ObstacleModifyNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2387) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=14) public List<ObstacleInfo> addObstacles = new ArrayList<>();
    @Tag(tag=7,isSigned=true) public List<Integer> removeObstacleIds = new ArrayList<>();
    @Tag(tag=9) public Integer sceneId = null;
}
