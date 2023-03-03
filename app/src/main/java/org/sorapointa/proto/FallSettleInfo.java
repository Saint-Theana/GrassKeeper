package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.OnlinePlayerInfo.*;
import org.sorapointa.proto.OnlinePlayerInfo;

public class FallSettleInfo {
    public static class MapFlowerRingCatchCountMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    @Tag(tag=15) public Integer catchCount = null;
    @Tag(tag=13) public OnlinePlayerInfo playerInfo = null;
    @Tag(tag=14) public Integer uid = null;
    @Tag(tag=3) public List<MapFlowerRingCatchCountMap> flowerRingCatchCountMap = new ArrayList<>();
    @Tag(tag=10) public Integer remainTime = null;
    @Tag(tag=1) public Integer finalScore = null;
}
