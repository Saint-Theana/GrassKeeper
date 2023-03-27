package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GCGMsgPVEIntentionInfo {
    public static class MapIntentionMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGMsgPVEIntention value = null;
    }

    @Tag(tag=15) public List<MapIntentionMap> intentionMap = new ArrayList<>();
}
