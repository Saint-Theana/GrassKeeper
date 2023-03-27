package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public class DungeonCandidateTeamInviteNotify {
    public enum DungeonCandidateTeamInviteNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=975) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=15) public Integer dungeonId = null;
    @Tag(tag=9) public Integer playerUid = null;
    @Tag(tag=4) public Integer vaildDeadlineTimeSec = null;
}
