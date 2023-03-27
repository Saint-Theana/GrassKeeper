package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonEntryPointInfo {
    @Tag(tag=1) public Integer sceneId = null;
    @Tag(tag=15) public Integer pointId = null;
    @Tag(tag=5) public List<DungeonEntryInfo> dungeonEntryList = new ArrayList<>();
    @Tag(tag=7) public Integer recommendDungeonId = null;
}
