package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonCandidateTeamPlayerDismissReason {
        @Tag(tag=0) DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_NORMAL ,
        @Tag(tag=1) DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DIE ,
        @Tag(tag=2) DUNGEON_CANDIDATE_TEAM_PLAYER_DISMISS_REASON_TPDR_DISCONNECT ;
}
