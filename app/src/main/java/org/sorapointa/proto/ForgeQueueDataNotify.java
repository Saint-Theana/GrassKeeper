package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForgeQueueData.*;
import org.sorapointa.proto.ForgeQueueData;

public class ForgeQueueDataNotify {
    public static class MapForgeQueueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ForgeQueueData value = null;
    }

    @Tag(tag=7) public List<MapForgeQueueMap> forgeQueueMap = new ArrayList<>();
    @Tag(tag=6) public List<Integer> removedForgeQueueList = new ArrayList<>();
}
