package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonCandidateTeamPlayerLeaveReason {
        @Tag(tag=0) DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_NORMAL ,
        @Tag(tag=1) DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_DIE ,
        @Tag(tag=2) DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_TPLR_BE_KICK ,
        @Tag(tag=3) DUNGEON_CANDIDATE_TEAM_PLAYER_LEAVE_REASON_DISCONNECT ;
}
