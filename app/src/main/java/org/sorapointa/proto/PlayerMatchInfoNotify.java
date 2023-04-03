package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerMatchInfoNotify {
    public enum PlayerMatchInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4196) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=1) public Integer hostUid = null;
    @Tag(tag=13) public Integer estimateMatchCostTime = null;
    @Tag(tag=2) public Integer mechanicusDifficultLevel = null;
    @Tag(tag=10) public List<Integer> matchParamList = new ArrayList<>();
    @Tag(tag=14) public Integer matchBeginTime = null;
    @Tag(tag=6) public Integer mpPlayId = null;
    @Tag(tag=5) public Integer matchType = null;
    @Tag(tag=8) public Integer matchId = null;
    @Tag(tag=7) public Integer dungeonId = null;
}
