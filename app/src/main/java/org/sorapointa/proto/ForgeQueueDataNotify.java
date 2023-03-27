package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ForgeQueueDataNotify {
    public static class MapForgeQueueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ForgeQueueData value = null;
    }

    public enum ForgeQueueDataNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=643) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public List<Integer> removedForgeQueueList = new ArrayList<>();
    @Tag(tag=14) public List<MapForgeQueueMap> forgeQueueMap = new ArrayList<>();
}
