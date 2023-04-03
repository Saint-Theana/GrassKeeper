package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.FleurFairBalloonSettleInfo.*;
import org.sorapointa.proto.FleurFairBalloonSettleInfo;

public class FleurFairBalloonSettleNotify {
    public static class MapSettleInfoMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public FleurFairBalloonSettleInfo value = null;
    }

    public enum FleurFairBalloonSettleNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=2183) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer minigameId = null;
    @Tag(tag=5) public List<MapSettleInfoMap> settleInfoMap = new ArrayList<>();
}
