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

    @Tag(tag=10) public List<MapPlayerStateMap> playerStateMap = new ArrayList<>();
    @Tag(tag=9) public Integer dungeonId = null;
    @Tag(tag=13) public List<Integer> readyPlayerUid = new ArrayList<>();
    @Tag(tag=2) public Integer matchType = null;
    @Tag(tag=4) public List<DungeonCandidateTeamAvatar> avatarList = new ArrayList<>();
}
