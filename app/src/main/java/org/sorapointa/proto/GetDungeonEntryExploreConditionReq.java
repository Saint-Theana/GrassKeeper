package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class GetDungeonEntryExploreConditionReq {
    public enum GetDungeonEntryExploreConditionReq_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3123) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer dungeonEntryScenePointId = null;
    @Tag(tag=13) public Integer sceneId = null;
    @Tag(tag=5) public Integer dungeonEntryConfigId = null;
}
