package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGEndReason {
        @Tag(tag=0) gCGEndReasonDefault ,
        @Tag(tag=1) gCGEndReasonDie ,
        @Tag(tag=2) gCGEndReasonSurrender ,
        @Tag(tag=3) gCGEndReasonDisconnected ,
        @Tag(tag=4) gCGEndReasonRoundLimit ,
        @Tag(tag=5) gCGEndReasonGM ,
        @Tag(tag=6) gCGEndReasonNoPlayer ,
        @Tag(tag=7) gCGEndReasonGiveUp ,
        @Tag(tag=8) gCGEndReasonIintTimeout ,
        @Tag(tag=9) gCGEndReasonEffect ,
        @Tag(tag=10) GHGBOGNDAJF ;
}
