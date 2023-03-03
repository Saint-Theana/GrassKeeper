package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MatchReason {
        @Tag(tag=0) MATCH_REASON_NONE ,
        @Tag(tag=1) MATCH_REASON_FINISH ,
        @Tag(tag=2) MATCH_REASON_PLAYER_CANCEL ,
        @Tag(tag=3) MATCH_REASON_TIMEOUT ,
        @Tag(tag=4) MATCH_REASON_PLAYER_CONFIRM ,
        @Tag(tag=5) MATCH_REASON_FAILED ,
        @Tag(tag=6) MATCH_REASON_SYSTEM_ERROR ,
        @Tag(tag=7) MATCH_REASON_INTERRUPTED ,
        @Tag(tag=8) MATCH_REASON_MP_UNAVAILABLE ,
        @Tag(tag=9) MATCH_REASON_CONFIRM_TIMEOUT ;
}
