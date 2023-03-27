package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class FleurFairFallSettleNotify {
    public static class MapSettleInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FleurFairFallSettleInfo value = null;
    }

    public enum FleurFairFallSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2150) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5) public List<MapSettleInfoMap> settleInfoMap = new ArrayList<>();
    @Tag(tag=12) public Integer minigameId = null;
}
