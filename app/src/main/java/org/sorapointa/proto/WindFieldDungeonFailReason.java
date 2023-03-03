package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum WindFieldDungeonFailReason {
        @Tag(tag=0) WIND_FIELD_DUNGEON_FAIL_REASON_NONE ,
        @Tag(tag=1) WIND_FIELD_DUNGEON_FAIL_REASON_CANCEL ,
        @Tag(tag=2) WIND_FIELD_DUNGEON_FAIL_REASON_TIMEOUT ,
        @Tag(tag=3) WIND_FIELD_DUNGEON_FAIL_REASON_ALL_AVATAR_DIE ,
        @Tag(tag=4) WIND_FIELD_DUNGEON_FAIL_REASON_LUA_INTERRUPT ;
}
