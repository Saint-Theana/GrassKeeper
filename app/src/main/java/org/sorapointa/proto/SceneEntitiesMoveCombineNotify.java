package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityMoveInfo.*;
import org.sorapointa.proto.EntityMoveInfo;

public class SceneEntitiesMoveCombineNotify {
    public enum SceneEntitiesMoveCombineNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3025) CmdId ,
        @Tag(tag=1) EnetChannelId ,
        @Tag(tag=0) EnetIsReliable ;
    }

    @Tag(tag=9) public List<EntityMoveInfo> entityMoveInfoList = new ArrayList<>();
}
