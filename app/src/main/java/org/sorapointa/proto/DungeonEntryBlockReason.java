package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum DungeonEntryBlockReason {
        @Tag(tag=0) DUNGEON_ENTRY_BLOCK_REASON_NONE ,
        @Tag(tag=1) DUNGEON_ENTRY_BLOCK_REASON_LEVEL ,
        @Tag(tag=2) DUNGEON_ENTRY_BLOCK_REASON_QUEST ,
        @Tag(tag=3) DUNGEON_ENTRY_BLOCK_REASON_MULTIPLE ;
}
