package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryInfo.*;
import org.sorapointa.proto.DungeonEntryInfo;

public class DailyDungeonEntryInfo {
    @Tag(tag=13) public Integer recommendDungeonId = null;
    @Tag(tag=8) public Integer dungeonEntryId = null;
    @Tag(tag=2) public Integer dungeonEntryConfigId = null;
    @Tag(tag=14) public DungeonEntryInfo recommendDungeonEntryInfo = null;
}
