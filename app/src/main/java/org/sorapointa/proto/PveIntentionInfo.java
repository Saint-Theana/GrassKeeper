package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.GCGMsgPVEIntention.*;
import org.sorapointa.proto.GCGMsgPVEIntention;

public class PveIntentionInfo {
    public static class MapIntentionMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public GCGMsgPVEIntention value = null;
    }

    @Tag(tag=15) public List<MapIntentionMap> intentionMap = new ArrayList<>();
}
