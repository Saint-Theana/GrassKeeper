package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ToTheMoonAddObstacleReq {
    public enum JNHMMGGPKOO {
        @Tag(tag=0) None ,
        @Tag(tag=6174) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public ToTheMoonObstacleInfo obstacle = null;
    @Tag(tag=7) public Integer sceneId = null;
    @Tag(tag=5,isSigned=true) public Integer queryId = null;
    @Tag(tag=15) public Boolean useEdge = null;
}
