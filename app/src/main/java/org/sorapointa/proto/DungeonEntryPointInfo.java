package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryInfo.*;
import org.sorapointa.proto.DungeonEntryInfo;

public class DungeonEntryPointInfo {
    @Tag(tag=12) public Integer sceneId = null;
    @Tag(tag=6) public Integer pointId = null;
    @Tag(tag=1) public List<DungeonEntryInfo> dungeonEntryList = new ArrayList<>();
    @Tag(tag=8) public Integer recommendDungeonId = null;
}
