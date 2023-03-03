package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGReason {
        @Tag(tag=0) GCG_REASON_DEFAULT ,
        @Tag(tag=1) GCG_REASON_EFFECT ,
        @Tag(tag=2) GCG_REASON_COST ,
        @Tag(tag=3) GCG_REASON_GM ,
        @Tag(tag=4) GCG_REASON_ATTACK ,
        @Tag(tag=5) GCG_REASON_REBOOT ,
        @Tag(tag=6) GCG_REASON_PLAY_CARD ,
        @Tag(tag=7) GCG_REASON_QUICKLY_ONSTAGE ,
        @Tag(tag=8) GCG_REASON_REMOVE_AFTER_DIE ,
        @Tag(tag=9) GCG_REASON_INIT ;
}
