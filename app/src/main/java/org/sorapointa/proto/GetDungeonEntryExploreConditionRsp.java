package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonEntryCond.*;
import org.sorapointa.proto.DungeonEntryCond;

public class GetDungeonEntryExploreConditionRsp {
    public enum GetDungeonEntryExploreConditionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3355) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=14,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public DungeonEntryCond dungeonEntryCond = null;
}
