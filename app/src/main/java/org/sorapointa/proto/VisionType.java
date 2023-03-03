package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum VisionType {
        @Tag(tag=0) VISION_TYPE_NONE ,
        @Tag(tag=1) VISION_TYPE_MEET ,
        @Tag(tag=2) VISION_TYPE_REBORN ,
        @Tag(tag=3) VISION_TYPE_REPLACE ,
        @Tag(tag=4) VISION_TYPE_WAYPOINT_REBORN ,
        @Tag(tag=5) VISION_TYPE_MISS ,
        @Tag(tag=6) VISION_TYPE_DIE ,
        @Tag(tag=7) VISION_TYPE_GATHER_ESCAPE ,
        @Tag(tag=8) VISION_TYPE_REFRESH ,
        @Tag(tag=9) VISION_TYPE_TRANSPORT ,
        @Tag(tag=10) VISION_TYPE_REPLACE_DIE ,
        @Tag(tag=11) VISION_TYPE_REPLACE_NO_NOTIFY ,
        @Tag(tag=12) VISION_TYPE_BORN ,
        @Tag(tag=13) VISION_TYPE_PICKUP ,
        @Tag(tag=14) VISION_TYPE_REMOVE ,
        @Tag(tag=15) VISION_TYPE_CHANGE_COSTUME ,
        @Tag(tag=16) VISION_TYPE_FISH_REFRESH ,
        @Tag(tag=17) VISION_TYPE_FISH_BIG_SHOCK ,
        @Tag(tag=18) VISION_TYPE_FISH_QTE_SUCC ,
        @Tag(tag=19) VISION_TYPE_CAPTURE_DISAPPEAR ;
}
