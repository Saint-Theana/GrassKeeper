package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonCandidateTeamDismissReason {
        @Tag(tag=0) DungeonCandidateTpdrNormal ,
        @Tag(tag=1) DungeonCandidateTpdrDie ,
        @Tag(tag=2) DungeonCandidateTpdrDisconnect ;
}
