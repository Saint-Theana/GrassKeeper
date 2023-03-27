package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneInitFinishReq {
    public enum SceneInitFinishReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=298) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer enterSceneToken = null;
}
