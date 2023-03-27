package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonWayPointActivateRsp {
    public enum DungeonWayPointActivateRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=962) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer wayPointId = null;
    @Tag(tag=3,isSigned=true) public Integer retcode = null;
}
