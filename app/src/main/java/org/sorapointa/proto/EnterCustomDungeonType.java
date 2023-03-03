package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum EnterCustomDungeonType {
        @Tag(tag=0) ENTER_CUSTOM_DUNGEON_TYPE_NONE ,
        @Tag(tag=1) ENTER_CUSTOM_DUNGEON_TYPE_EDIT ,
        @Tag(tag=2) ENTER_CUSTOM_DUNGEON_TYPE_PLAY ,
        @Tag(tag=3) ENTER_CUSTOM_DUNGEON_TYPE_OFFICIAL ;
}
