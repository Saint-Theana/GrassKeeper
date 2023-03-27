package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneEntityMoveReq {
    public enum SceneEntityMoveReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=270) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=0) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=5) public MotionInfo motionInfo = null;
    @Tag(tag=3) public Integer reliableSeq = null;
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=14) public Integer sceneTime = null;
}
