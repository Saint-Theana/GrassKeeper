package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForceDragAvatarNotify {
    public enum ForceDragAvatarNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3071) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14) public Long lastMoveTimeMs = null;
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=11) public MotionInfo motionInfo = null;
    @Tag(tag=1) public Long deltaTimeMs = null;
    @Tag(tag=5) public Boolean isFirstValid = null;
    @Tag(tag=4) public Integer sceneTime = null;
}
