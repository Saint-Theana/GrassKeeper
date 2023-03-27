package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGPhaseType {
        @Tag(tag=0) GCGPhaseInvalid ,
        @Tag(tag=1) GCGPhaseStart ,
        @Tag(tag=2) GCGPhaseDraw ,
        @Tag(tag=3) GCGPhaseOnStage ,
        @Tag(tag=4) GCGPhaseDice ,
        @Tag(tag=5) GCGPhaseMain ,
        @Tag(tag=6) GCGPhaseEnd ,
        @Tag(tag=7) GCGPhaseDie ,
        @Tag(tag=8) GCGPhaseFin ,
        @Tag(tag=9) GCGPhasePreMain ,
        @Tag(tag=10) GCGPhaseReroll ;
}
