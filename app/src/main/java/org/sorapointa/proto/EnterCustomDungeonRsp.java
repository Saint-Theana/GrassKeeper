package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.CustomDungeon.*;
import org.sorapointa.proto.CustomDungeon;
import org.sorapointa.proto.EnterCustomDungeonType.*;
import org.sorapointa.proto.EnterCustomDungeonType;

public class EnterCustomDungeonRsp {
    public static class MapRoomCostMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=14) public CustomDungeon customDungeon = null;
    @Tag(tag=2) public Integer enterType = null;
    @Tag(tag=10,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public List<MapRoomCostMap> roomCostMap = new ArrayList<>();
}
