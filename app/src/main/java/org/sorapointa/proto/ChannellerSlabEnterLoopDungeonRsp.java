package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabEnterLoopDungeonRsp {
    public enum ChannellerSlabEnterLoopDungeonRsp_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8892) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=5,isSigned=true) public Integer retcode = null;
    @Tag(tag=6) public Integer dungeonIndex = null;
    @Tag(tag=11) public List<Integer> conditionIdList = new ArrayList<>();
    @Tag(tag=2) public Integer pointId = null;
    @Tag(tag=4) public Integer difficultyId = null;
}
