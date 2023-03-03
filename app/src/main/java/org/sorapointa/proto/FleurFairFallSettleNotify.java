package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairFallSettleInfo.*;
import org.sorapointa.proto.FleurFairFallSettleInfo;

public class FleurFairFallSettleNotify {
    public static class MapSettleInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FleurFairFallSettleInfo value = null;
    }

    @Tag(tag=15) public Integer minigameId = null;
    @Tag(tag=11) public List<MapSettleInfoMap> settleInfoMap = new ArrayList<>();
}
