package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonCandidateTeamPlayerState {
        @Tag(tag=0) Idle ,
        @Tag(tag=1) ChangingAvatar ,
        @Tag(tag=2) Ready ;
}
