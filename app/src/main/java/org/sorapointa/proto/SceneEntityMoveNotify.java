package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneEntityMoveNotify {
    public enum SceneEntityMoveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=229) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public MotionInfo motionInfo = null;
    @Tag(tag=1) public Integer entityId = null;
    @Tag(tag=7) public Integer sceneTime = null;
    @Tag(tag=12) public Integer reliableSeq = null;
}
