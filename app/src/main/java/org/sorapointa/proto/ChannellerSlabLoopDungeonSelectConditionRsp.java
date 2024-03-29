package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonSelectConditionRsp {
    public enum ChannellerSlabLoopDungeonSelectConditionRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8943) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=10) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=15) public Integer dungeonIndex = null;
    @Tag(tag=6) public Integer difficultyId = null;
}
