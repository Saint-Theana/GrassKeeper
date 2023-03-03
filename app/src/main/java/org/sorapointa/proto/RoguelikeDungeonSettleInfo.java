package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.RoguelikeSettleCoinInfo.*;
import org.sorapointa.proto.RoguelikeSettleCoinInfo;

public class RoguelikeDungeonSettleInfo {
    public static class MapFinishedChallengeCellNumMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public RoguelikeSettleCoinInfo value = null;
    }

    @Tag(tag=5) public Integer stageId = null;
    @Tag(tag=15) public Boolean isFinalLevel = null;
    @Tag(tag=3) public List<MapFinishedChallengeCellNumMap> finishedChallengeCellNumMap = new ArrayList<>();
    @Tag(tag=13) public Boolean isCoinCReachLimit = null;
    @Tag(tag=9) public Integer curLevel = null;
    @Tag(tag=6) public Integer totalCoinBNum = null;
    @Tag(tag=10) public Integer totalCoinCNum = null;
}
