package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityMoveInfo.*;
import org.sorapointa.proto.EntityMoveInfo;

public class SceneEntitiesMovesReq {
    public enum SceneEntitiesMovesReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=241) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=0) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=8) public List<EntityMoveInfo> entityMoveInfoList = new ArrayList<>();
}
