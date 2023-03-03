package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGZoneType {
        @Tag(tag=0) GCG_ZONE_TYPE_INVALID ,
        @Tag(tag=1) GCG_ZONE_TYPE_DECK ,
        @Tag(tag=2) GCG_ZONE_TYPE_HAND ,
        @Tag(tag=3) GCG_ZONE_TYPE_CHARACTER ,
        @Tag(tag=4) GCG_ZONE_TYPE_MODIFY ,
        @Tag(tag=5) GCG_ZONE_TYPE_SUMMON ,
        @Tag(tag=7) GCG_ZONE_TYPE_ASSIST ,
        @Tag(tag=8) GCG_ZONE_TYPE_ONSTAGE ,
        @Tag(tag=9) GCG_ZONE_TYPE_RULE ;
}
