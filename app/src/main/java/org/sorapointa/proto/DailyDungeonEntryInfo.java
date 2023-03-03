package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryInfo.*;
import org.sorapointa.proto.DungeonEntryInfo;

public class DailyDungeonEntryInfo {
    @Tag(tag=12) public Integer dungeonEntryConfigId = null;
    @Tag(tag=15) public Integer dungeonEntryId = null;
    @Tag(tag=1) public DungeonEntryInfo recommendDungeonEntryInfo = null;
    @Tag(tag=4) public Integer recommendDungeonId = null;
}
