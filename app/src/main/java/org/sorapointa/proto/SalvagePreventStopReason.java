package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SalvagePreventStopReason {
        @Tag(tag=0) SALVAGE_PREVENT_STOP_REASON_NONE ,
        @Tag(tag=1) SALVAGE_PREVENT_STOP_REASON_SUCCESS ,
        @Tag(tag=2) SALVAGE_PREVENT_STOP_REASON_ARRIVAL ,
        @Tag(tag=3) SALVAGE_PREVENT_STOP_REASON_INTERRUPT ,
        @Tag(tag=4) SALVAGE_PREVENT_STOP_REASON_LEAVE ,
        @Tag(tag=5) SALVAGE_PREVENT_STOP_REASON_FULL ,
        @Tag(tag=6) SALVAGE_PREVENT_STOP_REASON_AWAY ;
}
