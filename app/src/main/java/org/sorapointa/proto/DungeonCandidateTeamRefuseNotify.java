package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamRefuseNotify {
    public enum DungeonCandidateTeamRefuseNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=928) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=10) public Integer playerUid = null;
}
