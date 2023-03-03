package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryInfo.*;
import org.sorapointa.proto.DungeonEntryInfo;
import org.sorapointa.proto.DungeonEntryPointInfo.*;
import org.sorapointa.proto.DungeonEntryPointInfo;

public class DungeonEntryInfoRsp {
    @Tag(tag=12) public List<DungeonEntryInfo> dungeonEntryList = new ArrayList<>();
    @Tag(tag=15) public Integer pointId = null;
    @Tag(tag=4) public List<DungeonEntryPointInfo> dungeonEntryPointList = new ArrayList<>();
    @Tag(tag=14) public Integer recommendDungeonId = null;
    @Tag(tag=11,isSigned=true) public Integer retcode = null;
}
