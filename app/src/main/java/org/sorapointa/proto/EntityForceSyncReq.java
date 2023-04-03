package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MotionInfo.*;
import org.sorapointa.proto.MotionInfo;

public class EntityForceSyncReq {
    public enum EntityForceSyncReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=230) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=13) public MotionInfo motionInfo = null;
    @Tag(tag=11) public Integer sceneTime = null;
    @Tag(tag=8) public Integer entityId = null;
    @Tag(tag=9) public Integer roomId = null;
}
