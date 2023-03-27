package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeDataNotify {
    public static class MapForgeQueueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ForgeQueueData value = null;
    }

    public enum ForgeDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=604) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=8) public Integer maxQueueNum = null;
    @Tag(tag=14) public List<MapForgeQueueMap> forgeQueueMap = new ArrayList<>();
    @Tag(tag=4) public List<Integer> forgeIdList = new ArrayList<>();
}
