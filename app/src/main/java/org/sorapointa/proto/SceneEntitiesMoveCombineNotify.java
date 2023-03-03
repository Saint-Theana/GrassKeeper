package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EntityMoveInfo.*;
import org.sorapointa.proto.EntityMoveInfo;

public class SceneEntitiesMoveCombineNotify {
    @Tag(tag=8) public List<EntityMoveInfo> entityMoveInfoList = new ArrayList<>();
}
