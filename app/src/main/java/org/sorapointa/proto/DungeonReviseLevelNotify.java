package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonReviseLevelNotify {
    @Tag(tag=5) public Integer sceneLevel = null;
    @Tag(tag=10) public Integer reviseLevel = null;
    @Tag(tag=3) public Integer dungeonId = null;
}
