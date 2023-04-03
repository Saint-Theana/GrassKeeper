package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;
import org.sorapointa.proto.DungeonCandidateTeamAvatar.*;
import org.sorapointa.proto.DungeonCandidateTeamAvatar;
import org.sorapointa.proto.DungeonCandidateTeamPlayerState.*;
import org.sorapointa.proto.DungeonCandidateTeamPlayerState;

public class DungeonCandidateTeamInfoNotify {
    public static class MapPlayerStateMap {
        @Tag(tag=1) public Integer key = null;
        @Tag(tag=2) public Integer value = null;
    }

    public enum DungeonCandidateTeamInfoNotify_CmdId {
        @Tag(tag=0) None ,
        @Tag(tag=918) CmdId ,
        @Tag(tag=0) EnetChannelId ,
        @Tag(tag=1) EnetIsReliable ;
    }

    @Tag(tag=9) public Integer dungeonId = null;
    @Tag(tag=8) public List<DungeonCandidateTeamAvatar> avatarList = new ArrayList<>();
    @Tag(tag=11) public List<Integer> readyPlayerUid = new ArrayList<>();
    @Tag(tag=2) public Integer matchType = null;
    @Tag(tag=15) public List<MapPlayerStateMap> playerStateMap = new ArrayList<>();
}
