package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SalvageEscortStopReason {
        @Tag(tag=0) SALVAGE_ESCORT_STOP_REASON_NONE ,
        @Tag(tag=1) SALVAGE_ESCORT_STOP_REASON_SUCCESS ,
        @Tag(tag=2) SALVAGE_ESCORT_STOP_REASON_DUMP ,
        @Tag(tag=3) SALVAGE_ESCORT_STOP_REASON_TIME ,
        @Tag(tag=4) SALVAGE_ESCORT_STOP_REASON_INTERRUPT ,
        @Tag(tag=5) SALVAGE_ESCORT_STOP_REASON_LEAVE ,
        @Tag(tag=6) SALVAGE_ESCORT_STOP_REASON_FULL ;
}
