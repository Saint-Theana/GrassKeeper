package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonWayPointNotify {
    public enum DungeonWayPointNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=980) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public List<Integer> activeWayPointList = new ArrayList<>();
    @Tag(tag=3) public Boolean isAdd = null;
}
