package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonEntryToBeExploreNotify {
    @Tag(tag=2) public Integer dungeonEntryScenePointId = null;
    @Tag(tag=4) public Integer sceneId = null;
    @Tag(tag=10) public Integer dungeonEntryConfigId = null;
}
