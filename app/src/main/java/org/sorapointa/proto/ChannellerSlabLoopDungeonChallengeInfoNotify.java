package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonChallengeInfoNotify {
    public enum ChannellerSlabLoopDungeonChallengeInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8499) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer difficultyId = null;
    @Tag(tag=1) public Integer challengeScore = null;
    @Tag(tag=10) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=3) public Integer dungeonIndex = null;
    @Tag(tag=8) public List<Integer> schemeBuffIdList = new ArrayList<>();
}
