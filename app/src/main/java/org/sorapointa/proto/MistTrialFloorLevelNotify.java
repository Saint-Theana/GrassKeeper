package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class MistTrialFloorLevelNotify {
    public enum MistTrialFloorLevelNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=911) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=9) public Integer dungeonSceneId = null;
    @Tag(tag=11) public Integer floorLevel = null;
}
