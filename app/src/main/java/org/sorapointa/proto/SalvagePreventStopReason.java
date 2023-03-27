package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum SalvagePreventStopReason {
        @Tag(tag=0) SalvagePreventStopNone ,
        @Tag(tag=1) SalvagePreventStopSuccess ,
        @Tag(tag=2) SalvagePreventStopArrival ,
        @Tag(tag=3) SalvagePreventStopInterrupt ,
        @Tag(tag=4) SalvagePreventStopLeave ,
        @Tag(tag=5) SalvagePreventStopFull ,
        @Tag(tag=6) SalvagePreventStopAway ;
}
