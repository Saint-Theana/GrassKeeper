package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonCandidateTeamPlayerLeaveReason {
        @Tag(tag=0) DungeonCandidateTplrNormal ,
        @Tag(tag=1) DungeonCandidateTplrDie ,
        @Tag(tag=2) DungeonCandidateTplrBeKick ,
        @Tag(tag=3) DungeonCandidateDisconnect ;
}
