package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class ChannelerSlabStageOneoffDungeonNotify {
    public enum ChannelerSlabStageOneoffDungeonNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=8449) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=4) public Boolean isDone = null;
    @Tag(tag=14) public Integer stageId = null;
}
