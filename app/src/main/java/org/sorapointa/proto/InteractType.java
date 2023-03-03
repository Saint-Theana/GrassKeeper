package org.sorapointa.proto;
import io.github.sainttheana.proto.core.Tag;
import java.util.List;
import java.util.ArrayList;

public enum InteractType {
        @Tag(tag=0) INTERACT_TYPE_NONE ,
        @Tag(tag=1) INTERACT_TYPE_PICK_ITEM ,
        @Tag(tag=2) INTERACT_TYPE_GATHER ,
        @Tag(tag=3) INTERACT_TYPE_OPEN_CHEST ,
        @Tag(tag=4) INTERACT_TYPE_OPEN_STATUE ,
        @Tag(tag=5) INTERACT_TYPE_CONSUME ,
        @Tag(tag=6) INTERACT_TYPE_MP_PLAY_REWARD ,
        @Tag(tag=7) INTERACT_TYPE_VIEW ,
        @Tag(tag=8) INTERACT_TYPE_GENERAL_REWARD ,
        @Tag(tag=9) INTERACT_TYPE_MIRACLE_RING ,
        @Tag(tag=10) INTERACT_TYPE_FOUNDATION ,
        @Tag(tag=11) INTERACT_TYPE_ECHO_SHELL ,
        @Tag(tag=12) INTERACT_TYPE_HOME_GATHER ,
        @Tag(tag=13) INTERACT_TYPE_ENV_ANIMAL ,
        @Tag(tag=14) INTERACT_TYPE_QUEST_GADGET ,
        @Tag(tag=15) INTERACT_TYPE_UI_INTERACT ,
        @Tag(tag=16) INTERACT_TYPE_DESHRET_OBELISK ;
}
