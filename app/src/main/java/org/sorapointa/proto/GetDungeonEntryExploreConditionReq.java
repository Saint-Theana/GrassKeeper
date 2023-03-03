package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetDungeonEntryExploreConditionReq {
    @Tag(tag=6) public Integer sceneId = null;
    @Tag(tag=2) public Integer dungeonEntryConfigId = null;
    @Tag(tag=4) public Integer dungeonEntryScenePointId = null;
}
