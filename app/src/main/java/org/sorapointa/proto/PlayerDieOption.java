package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum PlayerDieOption {
        @Tag(tag=0) PLAYER_DIE_OPTION_OPT_NONE ,
        @Tag(tag=1) PLAYER_DIE_OPTION_OPT_REPLAY ,
        @Tag(tag=2) PLAYER_DIE_OPTION_OPT_CANCEL ,
        @Tag(tag=3) PLAYER_DIE_OPTION_OPT_REVIVE ;
}
