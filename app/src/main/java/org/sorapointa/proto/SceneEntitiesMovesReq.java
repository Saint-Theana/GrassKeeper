package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityMoveInfo.*;
import org.sorapointa.proto.EntityMoveInfo;

public class SceneEntitiesMovesReq {
    @Tag(tag=14) public List<EntityMoveInfo> entityMoveInfoList = new ArrayList<>();
}
