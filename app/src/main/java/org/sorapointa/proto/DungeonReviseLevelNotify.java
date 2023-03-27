package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonReviseLevelNotify {
    public enum DungeonReviseLevelNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=991) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ,
        @Tag(tag=1) IsAllowClient ;
    }

    @Tag(tag=11) public Integer reviseLevel = null;
    @Tag(tag=13) public Integer sceneLevel = null;
    @Tag(tag=12) public Integer dungeonId = null;
}
