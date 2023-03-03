package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum TryCustomDungeonType {
        @Tag(tag=0) TRY_CUSTOM_DUNGEON_TYPE_NONE ,
        @Tag(tag=1) TRY_CUSTOM_DUNGEON_TYPE_ROOM ,
        @Tag(tag=2) TRY_CUSTOM_DUNGEON_TYPE_ALL ,
        @Tag(tag=3) TRY_CUSTOM_DUNGEON_TYPE_OFFICIAL_PLAY ;
}
