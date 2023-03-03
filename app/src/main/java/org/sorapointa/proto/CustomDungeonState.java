package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum CustomDungeonState {
        @Tag(tag=0) CUSTOM_DUNGEON_STATE_EDIT ,
        @Tag(tag=1) CUSTOM_DUNGEON_STATE_SELF_PASS ,
        @Tag(tag=2) CUSTOM_DUNGEON_STATE_PUBLISHED ;
}
