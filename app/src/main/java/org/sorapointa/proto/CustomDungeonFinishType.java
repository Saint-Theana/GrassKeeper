package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CustomDungeonFinishType {
        @Tag(tag=0) CUSTOM_DUNGEON_FINISH_TYPE_PLAY_NORMAL ,
        @Tag(tag=1) CUSTOM_DUNGEON_FINISH_TYPE_PLAY_TRY ,
        @Tag(tag=2) CUSTOM_DUNGEON_FINISH_TYPE_EDIT_TRY ,
        @Tag(tag=3) CUSTOM_DUNGEON_FINISH_TYPE_SELF_PLAY_NORMAL ;
}
