package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForgeQueueData.*;
import org.sorapointa.proto.ForgeQueueData;

public class ForgeGetQueueDataRsp {
    public static class MapForgeQueueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ForgeQueueData value = null;
    }

    public enum ForgeGetQueueDataRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=607) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=12,isSigned=true) public Integer retcode = null;
    @Tag(tag=7) public Integer maxQueueNum = null;
    @Tag(tag=4) public List<MapForgeQueueMap> forgeQueueMap = new ArrayList<>();
}
