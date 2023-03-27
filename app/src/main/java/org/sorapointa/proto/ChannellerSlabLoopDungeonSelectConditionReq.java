package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonSelectConditionReq {
    public enum ChannellerSlabLoopDungeonSelectConditionReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8368) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=4) public Integer dungeonIndex = null;
    @Tag(tag=2) public Integer difficultyId = null;
    @Tag(tag=3) public List<Integer> conditionIdList = new ArrayList<>();
}
