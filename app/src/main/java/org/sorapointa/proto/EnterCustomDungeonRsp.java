package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;
import org.sorapointa.proto.CustomDungeon.*;
import org.sorapointa.proto.CustomDungeon;

public class EnterCustomDungeonRsp {
    public static class MapRoomCostMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum EnterCustomDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=6245) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9,isSigned=true) public Integer retcode = null;
    @Tag(tag=4) public Integer enterType = null;
    @Tag(tag=2) public List<MapRoomCostMap> roomCostMap = new ArrayList<>();
    @Tag(tag=7) public CustomDungeon customDungeon = null;
}
