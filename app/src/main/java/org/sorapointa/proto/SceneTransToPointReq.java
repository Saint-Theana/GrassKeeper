package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneTransToPointReq {
    public enum SceneTransToPointReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=246) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=3) public Integer sceneId = null;
    @Tag(tag=10) public Integer pointId = null;
}
