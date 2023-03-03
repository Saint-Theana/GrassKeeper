package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.ForgeQueueData.*;
import org.sorapointa.proto.ForgeQueueData;

public class ForgeDataNotify {
    public static class MapForgeQueueMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public ForgeQueueData value = null;
    }

    @Tag(tag=5) public List<Integer> forgeIdList = new ArrayList<>();
    @Tag(tag=8) public List<MapForgeQueueMap> forgeQueueMap = new ArrayList<>();
    @Tag(tag=14) public Integer maxQueueNum = null;
}
