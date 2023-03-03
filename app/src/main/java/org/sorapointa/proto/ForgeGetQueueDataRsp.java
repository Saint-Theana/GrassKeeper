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

    @Tag(tag=2) public List<MapForgeQueueMap> forgeQueueMap = new ArrayList<>();
    @Tag(tag=15,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer maxQueueNum = null;
}
