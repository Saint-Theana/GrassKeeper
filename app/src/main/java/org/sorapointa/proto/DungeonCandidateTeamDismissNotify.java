package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonCandidateTeamDismissReason.*;
import org.sorapointa.proto.DungeonCandidateTeamDismissReason;

public class DungeonCandidateTeamDismissNotify {
    public enum DungeonCandidateTeamDismissNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=922) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=3) public Integer playerUid = null;
    @Tag(tag=4) public Integer reason = null;
}
