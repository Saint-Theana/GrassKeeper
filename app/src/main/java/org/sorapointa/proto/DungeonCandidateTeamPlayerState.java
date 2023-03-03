package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonCandidateTeamPlayerState {
        @Tag(tag=0) DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_IDLE ,
        @Tag(tag=1) DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_CHANGING_AVATAR ,
        @Tag(tag=2) DUNGEON_CANDIDATE_TEAM_PLAYER_STATE_READY ;
}
