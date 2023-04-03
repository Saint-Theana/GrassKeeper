package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class SceneEntityMoveRsp {
    public enum SceneEntityMoveRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=262) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Integer sceneTime = null;
    @Tag(tag=10) public Integer entityId = null;
    @Tag(tag=11) public Integer reliableSeq = null;
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public MotionInfo failMotion = null;
}
