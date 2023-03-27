package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class SceneEntitiesMovesRsp {
    public enum SceneEntitiesMovesRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=293) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=0) EnetIsReliable ;
    }

    @Tag(tag=5) public List<EntityMoveFailInfo> entityMoveFailInfoList = new ArrayList<>();
}
