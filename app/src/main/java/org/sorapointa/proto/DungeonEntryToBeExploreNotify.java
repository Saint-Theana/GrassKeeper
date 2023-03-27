package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonEntryToBeExploreNotify {
    public enum DungeonEntryToBeExploreNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=3446) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer sceneId = null;
    @Tag(tag=6) public Integer dungeonEntryScenePointId = null;
    @Tag(tag=4) public Integer dungeonEntryConfigId = null;
}
