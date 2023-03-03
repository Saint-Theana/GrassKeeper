package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum GCGGameBusinessType {
        @Tag(tag=0) GCG_GAME_BUSINESS_TYPE_NONE ,
        @Tag(tag=1) GCG_GAME_BUSINESS_TYPE_GM ,
        @Tag(tag=2) GCG_GAME_BUSINESS_TYPE_MATCH ,
        @Tag(tag=3) GCG_GAME_BUSINESS_TYPE_PVP ,
        @Tag(tag=4) GCG_GAME_BUSINESS_TYPE_TAVERN_CHALLENGE ,
        @Tag(tag=5) GCG_GAME_BUSINESS_TYPE_CONST_CHALLENGE ,
        @Tag(tag=6) GCG_GAME_BUSINESS_TYPE_WORLD_CHALLENGE ,
        @Tag(tag=7) GCG_GAME_BUSINESS_TYPE_BOSS_CHALLENGE ,
        @Tag(tag=8) GCG_GAME_BUSINESS_TYPE_WEEK_CHALLENGE ;
}
