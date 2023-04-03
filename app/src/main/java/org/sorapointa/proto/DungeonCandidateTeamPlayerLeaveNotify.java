package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonCandidateTeamPlayerLeaveReason.*;
import org.sorapointa.proto.DungeonCandidateTeamPlayerLeaveReason;

public class DungeonCandidateTeamPlayerLeaveNotify {
    public enum DungeonCandidateTeamPlayerLeaveNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=973) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=2) public Integer reason = null;
    @Tag(tag=12) public Integer playerUid = null;
}
