package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerStartMatchReq {
    @Tag(tag=3) public Integer matchType = null;
    @Tag(tag=12) public Integer mechanicusDifficultLevel = null;
    @Tag(tag=11) public List<Integer> matchParamList = new ArrayList<>();
    @Tag(tag=1) public Integer dungeonId = null;
    @Tag(tag=15) public Integer mpPlayId = null;
    @Tag(tag=6) public Integer matchId = null;
}
