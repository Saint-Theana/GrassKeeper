package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ToTheMoonObstacleInfo.*;
import org.sorapointa.proto.ToTheMoonObstacleInfo;

public class ToTheMoonObstaclesModifyNotify {
    public enum ONFMOJALOCB {
        @Tag(tag=0) None ,
        @Tag(tag=6114) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Boolean useEdge = null;
    @Tag(tag=11) public Integer sceneId = null;
    @Tag(tag=4,isSigned=true) public List<Integer> removeObstacleIds = new ArrayList<>();
    @Tag(tag=14) public List<ToTheMoonObstacleInfo> addObstacles = new ArrayList<>();
}
