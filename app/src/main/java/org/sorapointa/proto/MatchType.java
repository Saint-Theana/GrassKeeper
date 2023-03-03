package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum MatchType {
        @Tag(tag=0) MATCH_TYPE_NONE ,
        @Tag(tag=1) MATCH_TYPE_DUNGEON ,
        @Tag(tag=2) MATCH_TYPE_MP_PLAY ,
        @Tag(tag=3) MATCH_TYPE_MECHANICUS ,
        @Tag(tag=4) MATCH_TYPE_GENERAL ,
        @Tag(tag=5) MATCH_TYPE_GCG ;
}
