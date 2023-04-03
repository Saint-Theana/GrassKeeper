package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryPointInfo.*;
import org.sorapointa.proto.DungeonEntryPointInfo;
import org.sorapointa.proto.DungeonEntryInfo.*;
import org.sorapointa.proto.DungeonEntryInfo;

public class DungeonEntryInfoRsp {
    public enum DungeonEntryInfoRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=955) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<DungeonEntryPointInfo> dungeonEntryPointList = new ArrayList<>();
    @Tag(tag=4) public Integer recommendDungeonId = null;
    @Tag(tag=7) public Integer pointId = null;
    @Tag(tag=1) public List<DungeonEntryInfo> dungeonEntryList = new ArrayList<>();
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
