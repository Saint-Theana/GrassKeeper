package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGEndReason {
        @Tag(tag=0) GCG_END_REASON_DEFAULT ,
        @Tag(tag=1) GCG_END_REASON_DIE ,
        @Tag(tag=2) GCG_END_REASON_SURRENDER ,
        @Tag(tag=3) GCG_END_REASON_DISCONNECTED ,
        @Tag(tag=4) GCG_END_REASON_ROUND_LIMIT ;
}
