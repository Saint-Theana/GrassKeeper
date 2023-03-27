package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SalvageEscortStopReason {
        @Tag(tag=0) SalvageEscortStopNone ,
        @Tag(tag=1) SalvageEscortStopSuccess ,
        @Tag(tag=2) SalvageEscortStopDump ,
        @Tag(tag=3) SalvageEscortStopTime ,
        @Tag(tag=4) SalvageEscortStopInterrupt ,
        @Tag(tag=5) SalvageEscortStopLeave ,
        @Tag(tag=6) SalvageEscortStopFull ;
}
