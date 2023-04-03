package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.MatchType.*;
import org.sorapointa.proto.MatchType;

public class PlayerStartMatchReq {
    public enum PlayerStartMatchReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=4188) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=10) public Integer mechanicusDifficultLevel = null;
    @Tag(tag=15) public List<Integer> matchParamList = new ArrayList<>();
    @Tag(tag=5) public Integer mpPlayId = null;
    @Tag(tag=12) public Integer dungeonId = null;
    @Tag(tag=11) public Integer matchId = null;
    @Tag(tag=13) public Integer matchType = null;
}
