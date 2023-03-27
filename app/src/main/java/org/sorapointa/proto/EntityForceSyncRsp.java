package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class EntityForceSyncRsp {
    public enum EntityForceSyncRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=243) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public MotionInfo failMotion = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer entityId = null;
    @Tag(tag=2) public Integer sceneTime = null;
}
