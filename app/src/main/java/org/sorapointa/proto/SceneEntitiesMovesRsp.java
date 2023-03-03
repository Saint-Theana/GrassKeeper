package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityMoveFailInfo.*;
import org.sorapointa.proto.EntityMoveFailInfo;

public class SceneEntitiesMovesRsp {
    @Tag(tag=11) public List<EntityMoveFailInfo> entityMoveFailInfoList = new ArrayList<>();
}
