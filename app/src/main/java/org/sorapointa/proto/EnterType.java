package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum EnterType {
        @Tag(tag=0) ENTER_TYPE_NONE ,
        @Tag(tag=1) ENTER_TYPE_SELF ,
        @Tag(tag=2) ENTER_TYPE_GOTO ,
        @Tag(tag=3) ENTER_TYPE_JUMP ,
        @Tag(tag=4) ENTER_TYPE_OTHER ,
        @Tag(tag=5) ENTER_TYPE_BACK ,
        @Tag(tag=6) ENTER_TYPE_DUNGEON ,
        @Tag(tag=7) ENTER_TYPE_DUNGEON_REPLAY ,
        @Tag(tag=8) ENTER_TYPE_GOTO_BY_PORTAL ,
        @Tag(tag=9) ENTER_TYPE_SELF_HOME ,
        @Tag(tag=10) ENTER_TYPE_OTHER_HOME ,
        @Tag(tag=11) ENTER_TYPE_GOTO_RECREATE ;
}
