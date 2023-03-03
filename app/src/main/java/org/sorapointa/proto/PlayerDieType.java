package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerDieType {
        @Tag(tag=0) PLAYER_DIE_TYPE_NONE ,
        @Tag(tag=1) PLAYER_DIE_TYPE_KILL_BY_MONSTER ,
        @Tag(tag=2) PLAYER_DIE_TYPE_KILL_BY_GEAR ,
        @Tag(tag=3) PLAYER_DIE_TYPE_FALL ,
        @Tag(tag=4) PLAYER_DIE_TYPE_DRAWN ,
        @Tag(tag=5) PLAYER_DIE_TYPE_ABYSS ,
        @Tag(tag=6) PLAYER_DIE_TYPE_GM ,
        @Tag(tag=7) PLAYER_DIE_TYPE_CLIMATE_COLD ,
        @Tag(tag=8) PLAYER_DIE_TYPE_STORM_LIGHTING ;
}
