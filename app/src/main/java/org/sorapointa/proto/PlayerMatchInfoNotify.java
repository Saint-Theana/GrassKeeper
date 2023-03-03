package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerMatchInfoNotify {
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=4) public Integer matchBeginTime = null;
    @Tag(tag=10) public Integer dungeonId = null;
    @Tag(tag=11) public Integer matchType = null;
    @Tag(tag=12) public Integer mechanicusDifficultLevel = null;
    @Tag(tag=6) public List<Integer> matchParamList = new ArrayList<>();
    @Tag(tag=3) public Integer estimateMatchCostTime = null;
    @Tag(tag=5) public Integer mpPlayId = null;
    @Tag(tag=13) public Integer hostUid = null;
}
