package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGPhaseType {
        @Tag(tag=0) GCG_PHASE_TYPE_INVALID ,
        @Tag(tag=1) GCG_PHASE_TYPE_START ,
        @Tag(tag=2) GCG_PHASE_TYPE_DRAW ,
        @Tag(tag=3) GCG_PHASE_TYPE_ON_STAGE ,
        @Tag(tag=4) GCG_PHASE_TYPE_DICE ,
        @Tag(tag=5) GCG_PHASE_TYPE_MAIN ,
        @Tag(tag=6) GCG_PHASE_TYPE_END ,
        @Tag(tag=7) GCG_PHASE_TYPE_DIE ,
        @Tag(tag=8) GCG_PHASE_TYPE_FIN ,
        @Tag(tag=9) GCG_PHASE_TYPE_PRE_MAIN ,
        @Tag(tag=10) GCG_PHASE_TYPE_REROLL ;
}
