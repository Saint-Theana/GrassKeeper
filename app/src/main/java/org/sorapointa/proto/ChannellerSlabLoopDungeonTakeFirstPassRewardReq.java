package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannellerSlabLoopDungeonTakeFirstPassRewardReq {
    public enum ChannellerSlabLoopDungeonTakeFirstPassRewardReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8779) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=6) public Integer dungeonIndex = null;
}
